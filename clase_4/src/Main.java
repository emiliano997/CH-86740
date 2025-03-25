import database.DatabaseManager;

import java.util.Date;

public class Main {

  // El metodo main nos permite ejecutar el archivo
  public static void main(String[] args) {
    // Instanciamos la clase User
    // new -> Sirve para instanciar un nuevo objeto
    User jonathan = new User();

    // Seteamos sus propiedades
    jonathan.setUsername("jona12");
    jonathan.setPassword("123456");
    jonathan.setEmail("jonathan@gmail.com");
    jonathan.setAge(25);
    jonathan.setActive(true);
    jonathan.setCreatedAt(new Date());

    System.out.println("Jonathan username: " + jonathan.getUsername());
    System.out.println("Jonathan email: " + jonathan.getEmail());

    // Invocamos los métodos
    jonathan.login("jona", "12345619");

    // DatabaseManager Class
    DatabaseManager db = new DatabaseManager();
    db.setHost("localhost");
    db.setPort("3306");
    db.setDbType("mysql");
    db.setUsername("root");
    db.setPassword("root");
    db.setDbName("users");


  }
}
