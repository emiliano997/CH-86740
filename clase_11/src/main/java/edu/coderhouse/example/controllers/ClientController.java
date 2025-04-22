package edu.coderhouse.example.controllers;

import edu.coderhouse.example.entities.Client;
import edu.coderhouse.example.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

  @Autowired
  private ClientService clientService;

  @GetMapping
  public ResponseEntity<List<Client>> getAll() {
    return ResponseEntity.ok(this.clientService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Client>> getById(@PathVariable Long id) {
    Optional<Client> client = this.clientService.findById(id);

    if (client.isEmpty()) {
      return ResponseEntity.notFound().build(); // Devuelve Error 404 - Not Found
    }

    return ResponseEntity.ok(client);
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Client> create(@RequestBody Client client) {
    try {
      this.clientService.save(client);
      return ResponseEntity.ok(client);
    } catch (Exception error) {
      return ResponseEntity.badRequest().build(); // Devuelve Error 400 - Bad Request
    }
  }

  @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Optional<Client>> update(@PathVariable Long id, @RequestBody Client client) {
    Optional<Client> clientDb = this.clientService.updateClient(id, client);

    if (clientDb.isEmpty()) {
      return ResponseEntity.notFound().build(); // Devuelve Error 404 - Not Found
    }

    return ResponseEntity.ok(clientDb);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Optional<Client>> delete(@PathVariable Long id) {
    Optional<Client> client = this.clientService.deleteClient(id);

    if (client.isEmpty()) {
      return ResponseEntity.notFound().build(); // Devuelve Error 404 - Not Found
    }

    return ResponseEntity.ok(client);
  }
}
