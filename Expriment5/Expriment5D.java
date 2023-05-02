class Counter {
    private static int mCount = 0;

    Counter(){
        mCount ++;
    }

    public static int getCount(){
        return mCount;
    }


}

public class Expriment5D {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        new Counter();
        new Counter();
        new Counter();

        System.out.println(Counter.getCount());
    }
}
