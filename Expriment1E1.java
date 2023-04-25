import java.util.Scanner;

public class Expriment1E1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your Marks");
    float marks = scanner.nextFloat();

    int grade = (int) marks / 10;

    switch (grade) {
      case 10:
        System.out.println("Grade A");
        break;
      case 9:
        System.out.println("Grade A");
        break;
      case 8:
        System.out.println("Grade B");
        break;
      case 7:
        System.out.println("Grade C");
        break;
      case 6:
        System.out.println("Grade D");
        break;
      case 5:
        System.out.println("Grade E");
        break;
      default:
        System.out.println("Grade F");
    }
  }
}
