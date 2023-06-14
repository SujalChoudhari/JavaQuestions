import java.util.Scanner;

abstract class Shape {
    protected int x;
    protected int y;
    public abstract void read();
    public abstract double getArea();
}

class Circle extends Shape{

    public double getArea() {
        return  this.x * this.x * Math.PI;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Radius of Circle:");
        this.x = sc.nextInt();
    }
}

class Rectangle extends Shape {

    
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle:");
        this.x = sc.nextInt();
        System.out.println("Enter the breadth of the Rectangle:");
        this.y = sc.nextInt();
    }

    public double getArea() {
        return this.x * this.y;
    }

}

class Square extends Shape{

    public double getArea() {
        return  this.x * this.x;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter length of Square:");
        this.x = sc.nextInt();
    }
}



public class Expriment9A {

  public static void main(String[] args) {
    // Shape shape = new Shape(); -> error - cannot create object of abstract class
    Circle circle = new Circle();
    circle.read();
    System.out.println("Area of circle is " + circle.getArea());

    Rectangle rect = new Rectangle();
    rect.read();
    System.out.println("Area of Rectangle is " + rect.getArea());

    Square square = new Square();
    square.read();
    System.out.println("Area of Square is " + square.getArea());
  }
}
