package com.coder.song.entities;

import lombok.Data;

import java.util.UUID;

@Data
public class Artist {
  private UUID id;
  private String name;
  private Integer age;
  private String country;
}
