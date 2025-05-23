package com.coder.song.repositories;

import com.coder.song.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SongRepository extends JpaRepository<Song, UUID> {
  public List<Song> findByArtistId(UUID artistId);
}
