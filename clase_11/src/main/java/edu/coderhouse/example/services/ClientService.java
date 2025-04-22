package edu.coderhouse.example.services;

import edu.coderhouse.example.entities.Client;
import edu.coderhouse.example.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

  @Autowired
  private ClientRepository clientRepository;

  public void save(Client client) {
    this.clientRepository.save(client);
  }

  public Optional<Client> findById(Long id) {
    return this.clientRepository.findById(id);
  }

  public List<Client> findAll() {
    return this.clientRepository.findAll();
  }

  public Optional<Client> updateClient(Long id, Client client) {
    Optional<Client> clientDb = this.clientRepository.findById(id);

    if (clientDb.isEmpty()) {
      return Optional.empty();
    }

    clientDb.get().setName(client.getName());
    clientDb.get().setEmail(client.getEmail());

    this.clientRepository.save(clientDb.get());

    return clientDb;
  }

  public Optional<Client> deleteClient(Long id) {
    Optional<Client> clientDb = this.clientRepository.findById(id);

    if (clientDb.isEmpty()) {
      return Optional.empty();
    }

    this.clientRepository.delete(clientDb.get());

    return clientDb;
  }
}
