class Shape {

  private int mLength;
  private int mBreadth;

  Shape(){
    this.mLength = 0;
    this.mBreadth  = 0;
  }

  Shape(Shape c) {
    this.mLength = c.mLength;
    this.mBreadth = c.mBreadth;
  }

  Shape(int size){
    this.mLength = size;
    this.mBreadth = size;
  }

  Shape(int l, int b){
    this.mLength = l;
    this.mBreadth = b;
  }

  public int getArea() {
    return this.mLength * this.mBreadth;
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
