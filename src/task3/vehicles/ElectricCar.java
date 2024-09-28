package task3.vehicles;
public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric Engine";
    }

    @Override
    public String To_String() {
        return super.To_String() + " Battery capacity: " + this.batteryCapacity ;
    }

    public int GetBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void SetBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}