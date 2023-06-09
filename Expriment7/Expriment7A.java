class A {

  public int x = 20;
  protected int y = 10;

}

class B extends A {

  protected int w = 3;
  private int z = 4;

}

class C extends B {

  public int p = 5;
  public int q= 5;

}

public class Expriment7A {

  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();

    //System.out.println(c.z); //ERROR
    System.out.println(c.y); //Works
    System.out.println(b.y); //Works
  }
}
