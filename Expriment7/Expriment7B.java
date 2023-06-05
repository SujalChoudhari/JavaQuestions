import java.util.*;

class Staff {
    public int code;
    public String name;

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code:");
        this.code = sc.nextInt();
        System.out.println("Enter name:");
        this.name = sc.next();
    }

    public void display(){
        System.out.println("Code: " +code + " Name: " + name);
    }
}

class Teacher extends Staff {
    public String sub;
    public int exp;

    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter details for new Teacher");
        System.out.println("Enter subject:");
        this.sub = sc.next();
        System.out.println("Enter Exprience:");
        this.exp = sc.nextInt();
    }

    public void display(){
        super.display();
        System.out.println("Subject: " +sub + " Exp: " + exp);
    }
}


class Typist extends Staff {
    
    public int speed;
    public int exp;

    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter details for a Typist");
        System.out.println("Enter Speed");
        this.speed = sc.nextInt();
        System.out.println("Enter Exprience");
        this.exp = sc.nextInt();
    }

    public void display(){
        super.display();
        System.out.println("Speed: " +speed + " Exp: " + exp);
    }

}

class Regular extends Typist {
    public int sal;


    
    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter details for a Regular Typist");
        System.out.println("Enter Salary");
        this.sal = sc.nextInt();
    }

    public void display(){
        super.display();
        System.out.println("Sal: " + sal);
    }

}


class Casual extends Typist {
    public int daily_wages;


    
    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter details for a Casual Typist");
        System.out.println("Enter Daily Wages");
        this.daily_wages = sc.nextInt();
    }

    public void display(){
        super.display();
        System.out.println("Daily Wages: " + daily_wages);
    }

}


class Officer extends Staff {
    public String dept;
    public char grade;


    
    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for a Officer:");
        System.out.println("Enter Department:");
        this.dept = sc.next();
        System.out.println("Enter Grade:");
        this.grade = sc.next().charAt(0);
    }

    public void display(){
        super.display();
        System.out.println("Dept: " +dept + " Grade: " + grade);
    }
}



public class Expriment7B {
    public static void main(String[] args) {
        
        Staff staff = new Staff();
        staff.read();
        staff.display();

        Teacher teacher = new Teacher();
        teacher.read();
        teacher.display();

        Typist typeTypist = new Typist(); 
        typeTypist.read();
        typeTypist.display();
        
        Regular regTypist = new Regular();
        regTypist.read();
        regTypist.display();
        
        Casual casTypist = new Casual();
        casTypist.read();
        casTypist.display();

        Officer off = new Officer();
        off.read();
        off.display();
    }
}
