package com.project.project.controllers;

import com.project.project.entities.Client;
import com.project.project.services.DaoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

  @Autowired
  private DaoFactory daoFactory;

  @GetMapping
  public ResponseEntity<List<Client>> getClients() throws Exception {
    return ResponseEntity.ok(daoFactory.getClients());
  }

  @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
  public ResponseEntity<?> createClient(@RequestBody Client client) {
    try {
      daoFactory.create(client);
      return ResponseEntity.ok().build();
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }
}
