public class Operadores {

  public static void main(String[] args) {
    System.out.println("Operadores");

    // Sumar
    int resultado = 10 + 20; // Sumar
    String nombre = "Emiliano";
    String mensaje = "Bienvenido " + nombre; // Concatenar
    String mensaje2 = "Resultado: " + resultado;

    System.out.println(mensaje);
    System.out.println(mensaje2);

    // Restar
    resultado = 10 - 20; // Restar
    mensaje = "Resultado: " + resultado;
    System.out.println(mensaje);

    // Multiplicar
    resultado = 10 * 20; // Multiplicar
    mensaje = "Resultado: " + resultado;
    System.out.println(mensaje);

    // Dividir
    double resultado2 = 17 / 3.5; // Dividir
    mensaje = "Resultado: " + resultado2;
    System.out.println(mensaje);

    // Modulo
    resultado = 18 % 2; // Modulo
    mensaje = "Resultado: " + resultado;
    System.out.println(mensaje);
    boolean esPar = resultado == 0; // Comparar
    System.out.println(esPar);

    // Incremento
    int contador = 0;
    int numero = contador++;
    System.out.println(numero++);
    System.out.println(contador);
    // ++contador; // Pre-incremento
    // contador++; // Post-incremento
    // System.out.println(++contador);

    // Decremento
    contador = 0;
    numero = --contador;
    System.out.println(--numero);

    // Operadores de comparación
    int num1 = 10;
    double num2 = 10.0;
    boolean esIgual = 10 == 4; //
    esIgual = num1 == num2;
    boolean esDiferente = 10 != 4; // True
    boolean esMayor = 10 > 10; // False
    boolean esMenor = 10 < 10; // False

    boolean esMayorIgual = 10 >= 11; // False
    boolean esMenorIgual = 10 <= 8; // False

    System.out.println(esIgual);
  }
}
