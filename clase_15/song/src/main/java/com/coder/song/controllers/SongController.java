package com.coder.song.controllers;

import com.coder.song.entities.Artist;
import com.coder.song.entities.Song;
import com.coder.song.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/song")
public class SongController {

  @Autowired
  private SongService songService;

  @GetMapping
  public ResponseEntity<List<Song>> findAll() {
    return ResponseEntity.ok(songService.findAll());
  }

  @GetMapping("/artist/{artistId}")
  public ResponseEntity<List<Song>> findByArtistId(@PathVariable UUID artistId) {
    return ResponseEntity.ok(songService.findByArtistId(artistId));
  }

  @GetMapping("/{id}")
  public ResponseEntity<Song> findById(@PathVariable UUID id) {
    Song song = songService.findById(id);

    if (song == null) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(song);
  }

  @PostMapping
  public ResponseEntity<Song> save(@RequestBody Song song) {
    try {
      RestTemplate restTemplate = new RestTemplate();

      Artist artist = restTemplate.getForObject(
              "http://localhost:5000/api/artist/{id}",
              Artist.class,
              song.getArtistId()
      );

      if (artist == null) {
        return ResponseEntity.notFound().build();
      }

      song.setArtistId(artist.getId());

      return ResponseEntity.ok(songService.save(song));
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }
}
