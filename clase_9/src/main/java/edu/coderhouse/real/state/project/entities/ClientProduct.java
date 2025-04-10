package edu.coderhouse.real.state.project.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTS_PRODUCTS")
public class ClientProduct {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "AMOUNT", nullable = false)
  private long amount;

  @Column(name = "PRICE", nullable = false)
  private double price;

  @ManyToOne(fetch = FetchType.LAZY)
  private Client client;

  @ManyToOne(fetch = FetchType.LAZY)
  private Products products;
}
