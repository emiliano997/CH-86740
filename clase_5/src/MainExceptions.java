import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExceptions {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter a number: ");
      int number = sc.nextInt();

    } catch (InputMismatchException error) {
      System.out.println("Error: " + error.getMessage());
    } finally {
      System.out.println("Program finished");
    }


  }

  public static void division() throws ArithmeticException {
      System.out.println(10 / 0);
  }
}
