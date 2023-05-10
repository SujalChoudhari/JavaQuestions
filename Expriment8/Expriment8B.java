import java.util.*;

final class NoInheritance{
    public int x = 10;
}

class Inheritance {
    final float PI = 3.142f;
    
    final int add(int a,int b){
        return a + b;
    }

}

// class Test extends NoInheritance { } --> The type Test cannot subclass the final class NoInheritance

class Test2 extends Inheritance {
    // int add(int a,int b) {  --> Cannot override the final method from Inheritance
    //     return a - b;       
    // }
}

public class Expriment8B {
    public static void main(String[] args) {
        
        Inheritance obj = new Inheritance();
        // obj.PI = 3;  --> The final field Inheritance.PI cannot be assigned

    }
}