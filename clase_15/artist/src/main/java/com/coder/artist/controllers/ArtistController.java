package com.coder.artist.controllers;

import com.coder.artist.entities.Artist;
import com.coder.artist.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/artist")
public class ArtistController {

  @Autowired
  private ArtistService artistService;

  @GetMapping
  public ResponseEntity<List<Artist>> findAll() {
    return ResponseEntity.ok(artistService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Artist> findById(@PathVariable UUID id) {
    Artist artist = artistService.findById(id);

    if (artist == null) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(artist);
  }

  @PostMapping
  public ResponseEntity<Artist> save(@RequestBody Artist artist) {
    return ResponseEntity.ok(artistService.save(artist));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Artist> update(@PathVariable UUID id, @RequestBody Artist artist) {
    return ResponseEntity.ok(artistService.update(id, artist));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Artist> delete(@PathVariable UUID id) {
    return ResponseEntity.ok(artistService.delete(id));
  }
}
