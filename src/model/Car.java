package model;

public class Car {
    private String carName;
    private String color;
    private int licensePlate;
    private String carModel;

    public Car(){}

    public Car(String carName, String color, int licensePlate, String carModel) {
        this.carName=carName;
        this.color=color;
        this.licensePlate=licensePlate;
        this.carModel=carModel;
    }

}
