package edu.coderhouse.real.state.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "CLIENTS")
public class Client {

  public Client(String name, String lastName, long dni) {
    this.name = name;
    this.lastName = lastName;
    this.dni = dni;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "LAST_NAME", nullable = false)
  private String lastName;

  @Column(name = "DNI", nullable = false, unique = true)
  private long dni;

  @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Address> addresses;

  @ManyToMany(mappedBy = "clients")
  private List<Products> products;
}
