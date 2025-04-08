package edu.coderhouse.system_students.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ALUMNO")
public class Alumno {
  @Column(name = "NOMBRE")
  private String nombre;
  @Column(name = "APELLIDO")
  private String apellido;
  @Column(name = "DNI")
  private long dni;
  @Column(name = "LEGAJO")
  private long legajo;
}
