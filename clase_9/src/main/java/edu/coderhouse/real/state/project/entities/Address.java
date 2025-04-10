package edu.coderhouse.real.state.project.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ADDRESS")
public class Address {

  public Address(String streetName, String city, int number) {
    this.streetName = streetName;
    this.city = city;
    this.number = number;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "STREET_NAME", nullable = false)
  private String streetName;

  @Column(name = "CITY", nullable = false)
  private String city;

  @Column(name = "NUMBER", nullable = false)
  private int number;

  // Relación con cliente
  @ManyToOne(fetch = FetchType.LAZY)
  private Client client;

}
