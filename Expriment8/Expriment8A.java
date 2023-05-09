class Student {
    private int roll;

    public void read(int roll){
        this.roll = roll;
    }
}

class Test extends Student {
    public int sem1Marks;
    public int sem2Marks;

    public void read(int sem1, int sem2){
        this.sem1Marks = sem1;
        this.sem2Marks = sem2;
    }

}

interface Sports {
    public final int score = 5;
}

class Result extends Test implements Sports {
    public int total;

    public int total(){
        this.total = this.sem1Marks + this.sem2Marks + this.score;  
        return this.total;
    }
}

public class Expriment8A {
    public static void main(String[] args) {
        Result result  = new Result();
        result.read(4);
        result.read(30, 35);
        System.out.println(result.total());

    }
}