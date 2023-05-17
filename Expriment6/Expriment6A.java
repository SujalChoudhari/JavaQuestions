class TestClass {
    public static int count;
    TestClass(){
        count++;
        System.out.println("New Class Created");
    }
}


public class Expriment6A {
    public static void main(String[] args) {

        new TestClass();
        new TestClass();
        new TestClass();
        new TestClass();
        
        System.out.println("The total count is, " + TestClass.count);
    }
}