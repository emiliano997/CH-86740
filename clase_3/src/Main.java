public class Main {
  public static void main(String[] args) {
    // Arrays
    int[] numbers = new int[5]; // Forma tradicional

    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    // numbers[5] = 5; // ❌

    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println(numbers[3]);
    System.out.println(numbers[4]); // Returns 0

    String[] names = {
            "Jonathan",
            "Anderson",
            "Alejandro",
            "Augusto"
    };

    System.out.println(names[0]);
    System.out.println(names[1]);
    System.out.println(names[2]);
    System.out.println(names[3]);
  }
}