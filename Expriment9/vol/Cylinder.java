package vol;

import java.util.Scanner;

public class Cylinder {

  public double radius;
  public double height;

  public void read(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius:");
    radius = sc.nextDouble();

    System.out.println("Enter Height:");
    height = sc.nextDouble();
  }

  public double volume() {
    return 2 * Math.PI * radius * height;
  }
}


