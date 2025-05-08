package com.coder.main.entities;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Artist {
  private UUID id;
  private String name;
  private Integer age;
  private String country;
  private List<Song> songs;
}
