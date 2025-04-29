package com.reddit.blog.entities;

import lombok.Data;

@Data
public class User {
  private int id;
  private String name;
  private String username;
  private String email;
}
