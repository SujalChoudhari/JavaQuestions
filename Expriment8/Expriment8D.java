class Garbage {
    protected void finalize(){
        System.out.println("object has been deleted");
    }
}

public class Expriment8D {
    public static void main(String[] args) {
        Garbage garbage = new Garbage();
        garbage = null;
        System.gc();
    }
}
