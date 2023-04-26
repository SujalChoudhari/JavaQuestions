import java.util.Scanner;

public class Expriment3A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String:\n>>> ");
    String s = sc.nextLine();

    // flags
    int uppercase = 0, lowercase = 0, blank = 0, digits = 0;

    for (Character c : s.toCharArray()) {
      if (Character.isLowerCase(c)) 
        lowercase++;
      else if (Character.isUpperCase(c)) 
        uppercase++;
      else if(Character.isDigit(c)) 
        digits++;
      else if(Character.isSpaceChar(c)) 
        blank++;
    }

    System.out.println("Uppercase: " +uppercase);
    System.out.println("Lowercase: " +lowercase);
    System.out.println("Digit: " +digits);
    System.out.println("Blank Space: " +blank);
  }
}
