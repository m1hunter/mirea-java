package task3.app;
import task3.vehicles.Car;
import task3.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car0 = new Car();
        Car car1 = new Car("", "");
        Car car2 = new Car("HONDA CIVIC", "DEDOK", "SILVER", 2006, "OLEG",
                "12345678");
        Car car3 = new ElectricCar("PORSCHE TAYCAN", "PUCCKUE", "TOMATO RED", 2022,
                "IVAN", "87654321", 98);

        System.out.println("CAR0: " + car0.To_String());
        System.out.println("CAR1: " + car1.To_String());
        System.out.println("CAR2: " + car2.To_String());
        System.out.println("CAR3: " + car3.To_String());

    }
}