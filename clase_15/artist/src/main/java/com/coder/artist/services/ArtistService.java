package com.coder.artist.services;

import com.coder.artist.entities.Artist;
import com.coder.artist.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ArtistService {

  @Autowired
  private ArtistRepository artistRepository;

  public List<Artist> findAll() {
    return artistRepository.findAll();
  }

  public Artist findById(UUID id) {
    return artistRepository.findById(id).orElse(null);
  }

  public Artist save(Artist artist) {
    return artistRepository.save(artist);
  }

  public Artist update(UUID id, Artist artist) {
    Artist artistToUpdate = artistRepository.findById(id).orElse(null);

    if (artistToUpdate == null) {
      return null;
    }

    artistToUpdate.setName(artist.getName());
    artistToUpdate.setAge(artist.getAge());
    artistToUpdate.setCountry(artist.getCountry());

    return artistRepository.save(artistToUpdate);
  }

  public Artist delete(UUID id) {
    Artist artistToDelete = artistRepository.findById(id).orElse(null);

    if (artistToDelete == null) {
      return null;
    }

    artistRepository.deleteById(id);

    return artistToDelete;
  }
}
