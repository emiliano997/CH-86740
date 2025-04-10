package edu.coderhouse.real.state.project.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Data
@Entity
@Table(name = "PRODUCTS")
public class Products {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "DESCRIPTION", nullable = false)
  private double price;

  @Column(name = "STOCK", nullable = false)
  private int stock;

  // @ManyToMany
  // @JoinTable(
  //         name = "CLIENTS_PRODUCTS",
  //         joinColumns = @JoinColumn(name = "PRODUCT_ID"),
  //         inverseJoinColumns = @JoinColumn(name = "CLIENT_ID")
  // )
  // private List<Client> clients;
  @OneToMany(mappedBy = "products")
  private List<ClientProduct> clientProducts;

}
