class Death {
    Death() {
        System.out.println("Death object created");
    }

    protected void finalize(){
        System.out.println("Death Died");
    }
}

public class Expriment8D {
    public static void main(String[] args) {
        Death d = new Death();
        d = null;
        System.gc();
    }
}
