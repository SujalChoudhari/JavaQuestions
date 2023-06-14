import java.util.Vector;

class XAndYAreSameException extends ArithmeticException {
    XAndYAreSameException(String s){
        super(s);
    }
}

public class Func {

  static double solve(double x, double y) throws XAndYAreSameException {
    if (x == y) {
      throw new XAndYAreSameException("/ by Zero");
    }
    double den = x * x - y * y;
    return x / den;
  }

  public static void main(String[] args) {
    for (double x = 1f; x <= 5.0; x += 0.5f) {
      for (double y = 0f; y <= 4.0f; y += 0.5f) {
        try {
          System.out.println(
            "X:" + x + ", Y: " + y + "\n\tf(X,Y) = " + solve(x, y)
          );
        } catch (XAndYAreSameException e) {
          System.out.println("X:" + x + ", Y: " + y + " \n\tf(X,Y) = Invalid");
        }
      }
    }
  }
}
