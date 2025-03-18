import java.util.Scanner;

public class Ternario {

  public static void main(String[] args) {
    // Operador ternario
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su edad: ");
    int age = scanner.nextInt();

    // condición ? valor si es verdadero : valor si es falso
    String message = age < 18 ? "No puedes acceder al sistema" : "Acceso permitido";

    System.out.println(message);
  }
}
