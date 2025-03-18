import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Scanner -> Leer datos de la consola
    Scanner scanner = new Scanner(System.in);

    // String
    System.out.println("Ingrese su nombre: "); // Instrucción para el usuario
    String name = scanner.nextLine(); // Obtener el nombre del usuario

    // int
    System.out.println("Ingrese su edad: ");
    int age = scanner.nextInt();

    if (age < 18) {
      // Si el usuario es menor de edad
      System.out.println("No puedes continuar con este programa");
      return; // Termina la ejecución del programa
      // System.exit(0); // Termina la ejecución del programa
    } else {
      // Si el usuario es mayor de edad

      System.out.println("Ingrese su usuario: ");
      String username = scanner.next();

      switch (username) {
        case "emipe", "darioc", "andersono":
          System.out.println("Bienvenido a Coderhouse");
          break;

        default:
          System.out.println("Usuario no reconocido");
          return;
      }
    }

  }
}