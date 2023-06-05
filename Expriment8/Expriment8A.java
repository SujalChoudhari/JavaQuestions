import java.util.Scanner;

class Student {
    public int rollno;

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rollno");
        this.rollno = sc.nextInt();
    }
}

class Test extends Student {
    public int sem1Marks;
    public int sem2Marks;


    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sem1Marks");
        this.sem1Marks = sc.nextInt();
        System.out.println("Enter your sem2Marks");
        this.sem2Marks = sc.nextInt();
    }

}

interface Sports {
    public int score();
}

class Result extends Test implements Sports {
    public int total;

    public int total(){
        this.total = this.sem1Marks + this.sem2Marks + score();  
        return this.total;
    }

    public int score() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sports score");
        return sc.nextInt();
    }
}

public class Expriment8A {
    public static void main(String[] args) {
        Result result  = new Result();
        result.read();
        System.out.println( "Roll No:" + result.rollno + "\nScore: " + result.total());

    }
}