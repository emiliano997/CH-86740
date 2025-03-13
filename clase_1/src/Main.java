public class Main {
  public static void main(String[] args) {
    // Variables
    // int -> Entero
    int age;

    int year = 2025;
    int birthYear = 1997;

    age = year - birthYear;

    // Double | Float -> Decimal
    double height = 1.73;
    float weight = 63.8f;

    // Long -> Entero más grande que int
    long number = 100000000;

    // Boolean -> True/False
    boolean isAdult = age >= 18; // Edad es mayor o igual a 18

    // Char -> Caracter
    char symbol = '@';
    char symbolDollar = '$';

    // String -> Texto
    String name = "Emiliano";

    // int 12age = 20; // ❌
    // int _age = 20; // ✅ No es conveniente
    // int $age = 20; // ✅ No es conveniente
    int age2 = 38; // ✅

    // int return = 20; // ❌

    int i = 20; // Esto sirve para los bucles (variables temporales)

    System.out.println(age);
    System.out.println(isAdult);
  }
}