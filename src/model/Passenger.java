package model;

public class Passenger extends UserProfile {
    public Passenger(){}

    public Passenger(String firstName, String lastName, Gender gender, int nationalCode, String birthDate, String phoneNumber) {
        super(firstName, lastName, gender, nationalCode, birthDate, phoneNumber);
    }
}
