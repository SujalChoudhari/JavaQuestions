import java.util.Scanner;

public class Expriment3C {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String:\n>>> ");
    String s = sc.nextLine();


    String rev = "";
    for(int i=s.length()-1;i>=0;i--){
        rev += s.charAt(i);
    }

    if(s.compareTo(rev) == 0)
        System.out.println("Palindrome");
    else 
    System.out.println("Not Palindrome");

  }
}
