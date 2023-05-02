import java.util.Scanner;

public class Expriment3C {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String:\n>>> ");
    String s = sc.nextLine();

    String rev = new StringBuffer(s).reverse().toString();

    if (s.compareTo(rev) == 0) System.out.println(
      "Palindrome"
    ); else System.out.println("Not Palindrome");
  }
}
