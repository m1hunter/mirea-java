package task3.vehicles;
public class Car {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;

    private static int currentYear = 2024;

    protected String engineType;

    public Car () {}

    public Car (String model, String color) {
        this.model=model;
        this.color=color;
    }

    public Car (String model, String license, String color, int year, String ownerName, String insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = "Combustion Engine";

    }
    public String GetModel() {
        return model;
    }

    public String GetLicense() {
        return license;
    }

    public String GetColor() {
        return color;
    }

    public int GetYear() {
        return year;
    }

    public String GetOwnerName() { return ownerName; }

    public String GetInsuranceNumber() { return insuranceNumber; }

    public void SetModel(String model) {
        this.model = model;
    }

    public void SetLicense(String license) {
        this.license = license;
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public void SetYear(int year) {
        this.year = year;
    }

    public void SetOwnerName(String ownerName) { this.ownerName = ownerName; }

    public void SetInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public int GetCarAge() {
        return currentYear - this.year;
    }

    public String To_String() {
        return "Model: " + this.model + " License: " + this.license + " Color: " + this.color + " Year: " + this.year +
                " Age: " + GetCarAge() + " years" + " Insurance Number: " + this.insuranceNumber + " Owner: "
                + this.ownerName + " Engine Type: " + this.engineType;
    }
}