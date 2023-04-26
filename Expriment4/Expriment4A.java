import java.util.Scanner;
import java.util.Vector;

public class Expriment4A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Vector<String> studentNames = new Vector<>(args.length);

    for (String name : args) {
      studentNames.add(name);
    }

    System.out.println("All the names:");
    for (String name : studentNames) {
      System.out.println(name);
    }
  }
}
