import database.DatabaseManager;

import java.util.Date;

public class Main {

  // El metodo main nos permite ejecutar el archivo
  public static void main(String[] args) {
    // Instanciamos la clase User
    // new -> Sirve para instanciar un nuevo objeto
    User jonathan = new User(); // Variable local

    // Seteamos sus propiedades
    jonathan.setUsername("jona12");
    jonathan.setPassword("123456");
    jonathan.setEmail("jonathan@gmail.com");
    jonathan.setAge(25);
    jonathan.setActive(true);
    jonathan.setCreatedAt(new Date());

    // User.LIMIT_USERS = 15; // ❌

    System.out.println(User.LIMIT_USERS);

    System.out.println("Jonathan username: " + jonathan.getUsername());
    System.out.println("Jonathan email: " + jonathan.getEmail());

    // Invocamos los métodos
    jonathan.login("jona", "12345619");

    // DatabaseManager Class
    DatabaseManager db = new DatabaseManager(); // Variable local
    db.setHost("localhost");
    db.setPort("3306");
    db.setDbType("mysql");
    db.setUsername("root");
    db.setPassword("root");


  }
}
