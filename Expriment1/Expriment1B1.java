package Expriment1;
import java.util.*;

public class Expriment1B1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 3 number: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a > b) {
      if (a > c) {
        System.out.println("The largest number is " + a);
      } else {
        System.out.println("The largest number is " + c);
      }
    } else {
      if (b > c) {
        System.out.println("The largest number is " + b);
      } else {
        System.out.println("The largest number is " + c);
      }
    }
  }
}
