class Death {
    void kill(){
        System.out.println("object has been deleted");
    }
}

public class Expriment8D {
    public static void main(String[] args) {
        Death d = new Death();
        d.kill();
        d = null;
        System.gc();
    }
}
