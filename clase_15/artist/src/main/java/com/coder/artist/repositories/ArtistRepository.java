package com.coder.artist.repositories;

import com.coder.artist.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, UUID> {}
