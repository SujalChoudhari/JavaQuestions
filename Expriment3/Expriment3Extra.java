import java.util.Scanner;

public class Expriment3Extra {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter total size:");
    String[] str = new String[sc.nextInt()];

    for (int i = 0; i < str.length; i++) {
      System.out.println("Enter a name:");
      str[i] = sc.next();
    }

    for (int i = 0; i < str.length; i++) {
      for (int j = 0; j < str.length - 1; j++) {
          if ( str[i].compareTo(str[j]) < 0 ) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
          }
        
      }
    }
    System.out.println("\n\n\n\n");
    System.out.println("Sorted!\n");
    for(String s:str){
        System.out.println(s);
    }
  }
}
