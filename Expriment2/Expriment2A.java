import java.util.Scanner;

public class Expriment2A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // get the array
    System.out.println("Enter length of array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // create the resut
    int[] res = new int[size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i != j) res[i] += arr[j];
      }
    }

    for (int i = 0; i < size; i++) {
      System.out.print(res[i]);
    }
  }
}
