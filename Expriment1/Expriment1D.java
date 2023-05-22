import java.util.*;

public class Expriment1D {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    float a = sc.nextFloat();
    System.out.println("Enter another number:");
    float b = sc.nextFloat();

    // Menu
    System.out.println("\t===Calculator===");
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.println("5. Pow");
    System.out.println("6. Modulus");
    System.out.println("7. Exit");
    System.out.println("Enter your choice:");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("The sum is " + (a + b));
        break;
      case 2:
        System.out.println("The difference is " + (a - b));
        break;
      case 3:
        System.out.println("The product is " + (a * b));
        break;
      case 4:
        System.out.println("The quotient is " + (a / b));
        break;
      case 5:
        System.out.println("The result is " + (Math.pow(a, b)));
        break;
      case 6:
        System.out.println("The remainder is " + (a % b));
        break;
      case 7:
        System.out.println("Exiting...");
        break;
      default:
        System.out.println("Invalid choice");
        System.out.println("Exiting...");
    }
  }
}
