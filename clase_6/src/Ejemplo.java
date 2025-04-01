import java.util.Scanner;

public class Ejemplo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de personas a ingresar: ");
    int cantidad = sc.nextInt();

    for (int i = 0; i < cantidad; i++) {
      System.out.println("Ingrese el nombre de la persona " + (i + 1) + ": ");
      String nombre = sc.next();
      System.out.println("Ingrese el apellido de la persona " + (i + 1) + ": ");
      String apellido = sc.next();

      System.out.println(nombre + " " + apellido);
    }
  }
}
