package model;

public class UserProfile {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int nationalCode;
    private String birthDate;
    private String phoneNumber;

    public UserProfile(){}

    public UserProfile(String firstName, String lastName,Gender gender, int nationalCode, String birthDate, String phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.nationalCode=nationalCode;
        this.birthDate=birthDate;
        this.phoneNumber=phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void add(UserProfile userProfile) {
    }
}

