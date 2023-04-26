import java.util.Scanner;

class Expriment3B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String:\n>>> ");
    String s = sc.nextLine();

    System.out.print("Enter a character:\n>>> ");
    Character c = sc.nextLine().charAt(0);

    int counter=0;

    for(Character ch:s.toCharArray()){
        if(ch.equals(c))
            counter++;
    }

    System.out.println("Character " + c + " occurs " + counter + " times.");

  }
}
