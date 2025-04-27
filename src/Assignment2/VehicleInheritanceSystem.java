package Assignment2;
class Vehicle {
    protected String brand;
    protected int speed;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
class Car extends Vehicle {
    private int doors;
    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}
public class VehicleInheritanceSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);
        Motorcycle motorcycle = new Motorcycle("Harley", 160, false);
        System.out.println("Car Details:");
        car.displayInfo();
        System.out.println("\nMotorcycle Details:");
        motorcycle.displayInfo();
    }
}
