import java.util.Scanner;

public class Juego {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido al juego de adivina el número");
    System.out.println("Ingrese un número entre 1 y 10");

    int number = scanner.nextInt();

    if (number < 1 || number > 10) {
      System.out.println("El número debe estar entre 1 y 10");
      return;
    }

    int randomNumber = (int) (Math.random() * 10) + 1; // Generar un número aleatorio entre 1 y 10

    if (number == randomNumber) {
      System.out.println("¡Ganaste! El número es " + randomNumber);
    } else {
      System.out.println("Lo siento, no has adivinado el número " + randomNumber);
    }
  }
}
