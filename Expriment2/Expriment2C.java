import java.util.Scanner;

public class Expriment2C {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size to print the pattern:");
    int size = sc.nextInt();
    size++;
    int arr[][] = new int[size][];

    for (int i = 1; i < size; i++) {
      arr[i] = new int[i];
      for (int j = 0; j < i; j++) {
        arr[i][j] = j + 1;
      }
    }

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
  }
}
