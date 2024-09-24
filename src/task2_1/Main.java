package task2_1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("DODGE CHALLENGER", "OLOLOLLO", "YELLOW", 2015);
        Car car2 = new Car("HONDA CIVIC", "6AHDUTUK", "SILVER", 2006);

        System.out.println("CAR1: " + car1.To_String());
        System.out.println("CAR2: " + car2.To_String());

        car2.SetModel("KIA STINGER");
        car2.SetLicense("WALTRWHTE");
        car2.SetColor("LIME");
        car2.SetYear(2018);

        System.out.println("NEW CAR2: " + car2.To_String());
    }
}

