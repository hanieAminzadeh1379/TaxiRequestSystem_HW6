package model;

public class Driver extends UserProfile {
    public Driver(String firstName){}
    private Car car;

    public Driver(String firstName, String lastName, Gender gender, int nationalCode, String birthDate, String phoneNumber) {
        super(firstName,lastName,gender,nationalCode,birthDate,phoneNumber);
    }

    public Driver(String firstName, String lastName, Gender gender, int nationalCode, String birthDate, String phoneNumber, Car car) {
        super(firstName,lastName,gender,nationalCode,birthDate,phoneNumber);
        this.car=car;
    }

    public Driver() {

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addCar(String carName, String color, int licensePlate, String carModel) {
        Car car=new Car(carName, color, licensePlate, carModel);
    }
}
