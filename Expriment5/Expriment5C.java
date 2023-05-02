class Complex {

  public double x;
  public double y;

  Complex(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public static Complex add(Complex first, Complex second) {
    return new Complex(first.x + second.x, first.y + second.y);
  }

  public static Complex sub(Complex first, Complex second) {
    return new Complex(first.x - second.x, first.y - second.y);
  }

  public static Complex mul(Complex first, Complex second) {
    return new Complex(first.x * second.x, first.y * second.y);
  }

  public static Complex div(Complex first, Complex second){
    return new Complex(first.x / second.x,first.y / second.y);
}
}

public class Expriment5C {

  public static void main(String[] args) {
    Complex c1 = new Complex(3,0.3);
    Complex c2 = new Complex(-2,5.6);

    Complex c3 = Complex.add(c1, c2);
    Complex c4 = Complex.sub(c1, c2);
    Complex c5 = Complex.mul(c1, c2);
    Complex c6 = Complex.div(c1, c2);

    System.out.println("Add result {X: " + c3.x + ", Y:" + c3.y + "}" );
    System.out.println("Sub result {X: " + c4.x + ", Y:" + c4.y + "}" );
    System.out.println("Mul result {X: " + c5.x + ", Y:" + c5.y + "}" );
    System.out.println("Div result {X: " + c6.x + ", Y:" + c6.y + "}" );

  }
}
