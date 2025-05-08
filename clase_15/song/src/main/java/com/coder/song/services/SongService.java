package com.coder.song.services;

import com.coder.song.entities.Song;
import com.coder.song.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SongService {

  @Autowired
  private SongRepository songRepository;

  public List<Song> findAll() {
    return songRepository.findAll();
  }

  public Song findById(UUID id) {
    return songRepository.findById(id).orElse(null);
  }

  public List<Song> findByArtistId(UUID artistId) {
    return songRepository.findByArtistId(artistId);
  }

  public Song save(Song song) {
    return songRepository.save(song);
  }
}
