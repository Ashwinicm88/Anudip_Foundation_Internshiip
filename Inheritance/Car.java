package Inheritance;

public class Car {
    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.start();
        obj.stop();
        obj.drive();
    }
}

class Vehicle{
    void start(){
        System.out.println("Start the vehicle....");
    }
    void stop(){
        System.out.println("Stop the vehicle....");
    }
}
class Bike extends Vehicle{
    void drive(){
        System.out.println("driving a bike...");
    }
}
