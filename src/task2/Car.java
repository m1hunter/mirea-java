package task2;

public class Car {
    private String model;
    private String license;
    private String color;
    private int year;
    private static int currentYear = 2024;
    //  По умолчанию
    public Car() {}
    // С 2 параметрами
    public Car(String model, String license) {
        this.model = "PEGASSI INFERNUS";
        this.license = "FCL1989";
    }
    // Получает значения от пользователя в main
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
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

    public int GetCarAge() {
        return currentYear - this.year;
    }

    public String To_String() {
        return "Model: " + this.model + " License: " + this.license + " Color: " + this.color + " Year: " + this.year
                + " Age: " + GetCarAge() + " years";
    }
}
