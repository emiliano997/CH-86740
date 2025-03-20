public class Bucles {
  public static void main(String[] args) {
    // Bucles
    // while y do-while
    // while -> Se ejecutará hasta que se cumpla la condición
    int flag = 0;
    while (flag < 5) {
      System.out.println("Bucle while " + flag);
      flag++;
    }

    // do-while -> Se ejecuta primero y luego se comprueba la condición
    flag = 0;
    do {
      System.out.println("Bucle do-while " + flag);
    } while (false);
  }
}
