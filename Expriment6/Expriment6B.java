class Shape {

  public int x;
  public int y;

  Shape(){
    this.x = 0;
    this.y  = 0;
  }

  Shape(Shape c) {
    this.x = c.x;
    this.y = c.y;
  }

  Shape(int size){
    this.x = size;
    this.y = size;
  }

  Shape(int l, int b){
    this.x = l;
    this.y = b;
  }


  public int getArea() {
    return this.x * this.y;
  }


}

public class Expriment6B {

  public static void main(String[] args) {
    Shape a = new Shape();
    Shape b = new Shape(5);
    Shape c = new Shape(b);
    Shape d = new Shape(3,4);


    System.out.println("Area are: ");
    System.out.println(a.getArea());
    System.out.println(b.getArea());
    System.out.println(c.getArea());
    System.out.println(d.getArea());
  }
}
