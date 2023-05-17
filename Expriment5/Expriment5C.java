class Complex {

  public double x;
  public double y;

  Complex(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Complex add(Complex first, Complex second) {
    return new Complex(first.x + second.x, first.y + second.y);
  }

  public Complex sub(Complex first, Complex second) {
    return new Complex(first.x - second.x, first.y - second.y);
  }

  public String toString(){
    return "{ "+ this.x + "+ "+this.y+"i }";
  }

}

public class Expriment5C {


  public static void main(String[] args) {
    Complex complexinator = new Complex(0, 0);
    Complex c1 = new Complex(3,0.3);
    Complex c2 = new Complex(2,5.6);

    Complex c3 = complexinator.add(c1, c2);
    Complex c4 = complexinator.sub(c1, c2);
    System.out.println(c1.x);

    System.out.println("Add result " + c3 );
    System.out.println("Sub result " + c4 );


  }
}
