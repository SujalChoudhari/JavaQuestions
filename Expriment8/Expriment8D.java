class Death {
    Death() {
        System.out.println("Death object created");
    }
}

public class Expriment8D {
    public static void main(String[] args) {
        Death d = new Death();
        d = null;
        System.gc();
        System.out.println("Death Died!");
    }
}
