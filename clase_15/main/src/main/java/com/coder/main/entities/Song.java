package com.coder.main.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.UUID;

@Data
public class Song {
  private UUID id;
  private String title;
  private Integer duration;
  private String album;

  @JsonIgnoreProperties("artistId")
  private UUID artistId;
}
