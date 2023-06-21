package PracticePrograms;

class Employee {
    public int id;
    public String name;
    public double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    public void displayDetails() {
        System.out.println("Employee: " + id + ": " + name + ": " + salary);
    }
}

class Manager extends Employee {
    byte teamSize;

    Manager(int id, String name, double salary, byte teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void calculateSalary() {
        double salary = this.salary + (this.salary * 0.1);
        System.out.println("Salary: " + salary);
    }

}

class Intern extends Employee {
    float duration;
    String supervisor;

    Intern(int id, String name, double salary, float duration, String supervisor) {
        super(id, name, salary);
        this.duration = duration;
        this.supervisor = supervisor;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Interns do not get salary :(");
    }
}

public class HRSystem {
    public static void main(String[] args) {
        // Demonstrate inheritance using HR system
        Manager manager = new Manager(1, "John", 10000, (byte) 5);
        Intern intern = new Intern(2, "Jane", 0, 6, "John");

        manager.displayDetails();
        manager.calculateSalary();

        intern.displayDetails();
        intern.calculateSalary();
    }
}
