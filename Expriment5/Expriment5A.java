import java.util.Scanner;

public class Expriment5A {

  public static void main(String[] args) {
    System.out.println("Enter a base and an exponent: ");
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int pow = sc.nextInt();

    System.out.println("Result of " + base + "^" + pow + " is " + power(base, pow));
  }

  private static int power(int x, int n) {
    if(n == 0) return 1;
    return x * power(x,n-1);

  }
}
