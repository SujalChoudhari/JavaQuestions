import java.util.*;

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
    
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter details for new Teacher");
        System.out.println("Enter subject:");
        this.sub = sc.next();
        System.out.println("Enter Exprience:");
        this.exp = sc.nextInt();
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
    
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter details for a Regular Typist");
        System.out.println("Enter Salary");
        this.sal = sc.nextInt();
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
    
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter details for a Casual Typist");
        System.out.println("Enter Daily Wages");
        this.daily_wages = sc.nextInt();
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
    
    
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for a Officer:");
        System.out.println("Enter Department:");
        this.dept = sc.next();
        System.out.println("Enter Grade:");
        this.grade = sc.next().charAt(0);
    }

    public void display(){
        System.out.println("Dept: " +dept + " Grade: " + grade);
    }
}



public class Expriment7B {
    public static void main(String[] args) {
        
        Staff staff = new Staff(1, "A");

        Teacher teacher = new Teacher(-1, "Teac");
        teacher.read();
        teacher.display();

        Typist typeTypist = new Typist(2, "Type", 40, 12); 
        Regular regTypist = new Regular(3, "Regu", 66, 4);
        regTypist.read();
        Casual casTypist = new Casual(4, "Cas", 50, 3);
        casTypist.read();
        casTypist.display();
        regTypist.display();

        Officer off = new Officer(5, "Off");
        off.read();
        off.display();
    }
}
