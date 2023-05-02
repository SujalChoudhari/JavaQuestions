import java.util.Scanner;
import java.util.Vector;

public class Expriment4B {

  public static void main(String[ ] args) {
    Scanner sc = new Scanner(System.in);
    Vector<String> str = new Vector<>(5);

    System.out.println(
      "Enter Names of students:\n Use :q to quit entering names"
    );
    while (true) {
      System.out.print(">>> ");
      String newName = sc.nextLine();
      if (newName.contains(":q")) break;

      str.add(newName);
    }
    System.out.println("Enter string to add or remove");
    String newStr = sc.nextLine();

    for(int i=0;i<str.size();i++){
        if(newStr.equals(str.get(i))){
            str.remove(i);
        }
	else {
		str.add(i);
		break;
	}
    }

    System.out.println("All the remaining names:");
    for (String name : str) {
      System.out.println(name);
    }
  }
}
