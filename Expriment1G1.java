public class Expriment1G1 {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (i % 2 != 0) {
          System.out.print(j);
        } else {
          System.out.print(i + 1 - j);
        }
        System.out.print("\t");
      }
      System.out.println();
    }
  }
}
