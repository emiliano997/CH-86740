package com.coder.main.services;

import com.coder.main.entities.Artist;
import com.coder.main.entities.Song;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service
public class MainService {

  public Artist getArtistById(UUID id) {
    RestTemplate restTemplate = new RestTemplate();

    Artist artist = restTemplate.getForObject(
            "http://localhost:5000/api/artist/{id}",
            Artist.class,
            id
    );

    if (artist == null) {
      return null;
    }

    List<Song> songs = restTemplate.getForObject(
            "http://localhost:5100/api/song/artist/{id}",
            List.class,
            id
    );

    artist.setSongs(songs);

    return artist;
  }
}
