import java.util.Scanner;

public class MesActualIf {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el mes actual: ");

    int monthNumber = scanner.nextInt();
    String monthName;

    if (monthNumber == 1) {
      monthName = "Enero";
    } else if (monthNumber == 2) {
      monthName = "Febrero";
    } else if (monthNumber == 3) {
      monthName = "Marzo";
    } else if (monthNumber == 4) {
      monthName = "Abril";
    } else if (monthNumber == 5) {
      monthName = "Mayo";
    } else if (monthNumber == 6) {
      monthName = "Junio";
    } else if (monthNumber == 7) {
      monthName = "Julio";
    } else if (monthNumber == 8) {
      monthName = "Agosto";
    } else if (monthNumber == 9) {
      monthName = "Septiembre";
    } else if (monthNumber == 10) {
      monthName = "Octubre";
    } else if (monthNumber == 11) {
      monthName = "Noviembre";
    } else if (monthNumber == 12) {
      monthName = "Diciembre";
    } else {
      monthName = "Error";
    }

    if (monthName == "Error") {
      System.out.println("Error: El mes no es correcto");
      return;
    }

    System.out.println("El mes actual es " + monthName);
  }
}
