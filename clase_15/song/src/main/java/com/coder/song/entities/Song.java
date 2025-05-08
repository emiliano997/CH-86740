package com.coder.song.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "song")
public class Song {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private Integer duration;

  @Column(nullable = false)
  private String album;

  @Column(name = "artist_id", nullable = false)
  private UUID artistId;
}
