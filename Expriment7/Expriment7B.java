import java.lang.invoke.StringConcatFactory;

import javax.sound.midi.Track;

class Staff {
    public int code;
    public String name;

    Staff(int code, String name){
        this.code = code;
        this.name = name;
    }
}

class Teacher extends Staff {
    public String sub;
    public int exp;

    Teacher(int code, String name){
        super(code, name);
    }
    
    public void read(String sub, int exp){
        
        this.sub = sub;
        this.exp = exp;
    }

    public void display(){
        System.out.println("Subject: " +sub + " Exp: " + exp);
    }
}


class Typist extends Staff {
    
    public int speed;
    public int exp;
    
    Typist(int code, String name, int speed, int exp){
        super(code, name);
        this.speed = speed;
        this.exp = exp;
    }
}

class Regular extends Typist {
    public int sal;

    Regular(int code,String name, int speed, int exp){
        super(code, name, speed, exp);
    }
    
    public void read(int sal){
        this.sal = sal;
    }

    public void display(){
        System.out.println("Sal: " + sal);
    }

}


class Casual extends Typist {
    public int daily_wages;

    Casual(int code,String name, int speed, int exp){
        super(code, name, speed, exp);
    }
    
    public void read(int daily_wages){
        this.daily_wages = daily_wages;
    }

    public void display(){
        System.out.println("Daily Wages: " + daily_wages);
    }

}


class Officer extends Staff {
    public String dept;
    public char grade;

    Officer(int code, String name){
        super(code, name);
    }
    
    
    public void read( String dept, char grade){
        this.dept = dept;
        this.grade = grade;
    }

    public void display(){
        System.out.println("Dept: " +dept + " Grade: " + grade);
    }
}



public class Expriment7B {
    public static void main(String[] args) {
        
        Staff staff = new Staff(1, "A");

        Teacher teacher = new Teacher(-1, "Teac");
        teacher.read("Huh",  6);
        teacher.display();

        Typist typeTypist = new Typist(2, "Type", 40, 12); 
        Regular regTypist = new Regular(3, "Regu", 66, 4);
        regTypist.read(30000);
        Casual casTypist = new Casual(4, "Cas", 50, 3);
        casTypist.read(1000);
        casTypist.display();
        regTypist.display();

        Officer off = new Officer(5, "Off");
        off.read("IT", 'A');
        off.display();
    }
}
