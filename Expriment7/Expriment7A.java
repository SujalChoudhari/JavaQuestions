class A {

  public int x;
  protected int y;

  A(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class B extends A {

  protected int w;
  private int z;

  B(int x, int y, int z, int w) {
    super(x, y);
    this.z = z;
    this.w = w;
  }
}

class C extends B {

  public int p;
  public int q;

  C(int x, int y, int z, int w, int p, int q) {
    super(x, y, z, w);
  }
}

public class Expriment7A {

  public static void main(String[] args) {
    A a = new A(2, 5);
    B b = new B(5, 9, 8, 6);
    C c = new C(7, 9, 87, 6, 4, 3);

    // System.out.println(c.z); ERROR
    // System.out.println(c.y); Works
    // System.out.println(b.y); Works
  }
}
