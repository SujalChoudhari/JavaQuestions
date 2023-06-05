
class Vehicle {
     public void start(){
        System.out.println("Brrrrrrrrrrrrrr!");
     }
}

class Car extends Vehicle {
    public void start(){
        System.out.println("Vroommmmmmmmmmm!");
    }
}

class Audi extends Car {
    public void start(){
        System.out.println("Zooommmmmmmmmmmm!");
    }
}

public class Expriment8C {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        Car car = new Car();
        Audi audi = new Audi();

        Vehicle ref;

        ref = veh;
        ref.start();

        ref = car;
        ref.start();

        ref = audi;
        ref.start();
    }
}
