package com.coder.main.controllers;

import com.coder.main.entities.Artist;
import com.coder.main.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class MainController {

  @Autowired
  private MainService mainService;

  @GetMapping("/artist/{id}")
  public ResponseEntity<Artist> getArtistById(@PathVariable UUID id) {
    try {
      Artist artist = mainService.getArtistById(id);

      if (artist == null) {
        return ResponseEntity.notFound().build();
      }

      return ResponseEntity.ok(artist);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return ResponseEntity.badRequest().build();
    }
  }
}
