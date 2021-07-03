package Sandbox.src.VehicleClasses;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();

        System.out.println(car.createName("BMW"));

        System.out.println(truck.createName("BMW"));
    }
}
    