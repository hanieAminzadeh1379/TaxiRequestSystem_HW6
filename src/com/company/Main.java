package com.company;

import dataaccess.DatabaseAccess;
import dataaccess.DriverDatabaseAccess;
import dataaccess.PassengerDatabaseAccess;
import model.Driver;
import model.Gender;
import model.Passenger;
import model.Car;

//import java.util.Random;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;


public class Main {
    public static Driver driver = new Driver();
    public static Passenger passenger = new Passenger();
    public static Car car = new Car();
    public static
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        showMainMenu();

        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Enter number of Drivers :");
                int driversNumber = scanner.nextInt();
                addAGroupOfDriver(driversNumber);
                break;
            case 2:
                System.out.println("Enter number of Passengers :");
                int passengersNumber = scanner.nextInt();
                addAGroupOfPassenger(passengersNumber);
                break;
//            case 3:
//                System.out.println("Enter your NationalCode :");


        }
    }

    private static void showMainMenu() {
        System.out.println("1) Add a group of drivers");
        System.out.println("2) Add a group of passengers");
        System.out.println("3) Driver signup or login");
        System.out.println("4) Passenger signup or login");
        System.out.println("5) show a list of drivers");
        System.out.println("6) show a list of passengers");
        System.out.println("7) exit");
    }

    public static void addAGroupOfDriver(int driversNumber) throws SQLException, ClassNotFoundException {

        DriverDatabaseAccess driverDatabaseAccess = new DriverDatabaseAccess();
        for (int i = 0; i < driversNumber; i++) {
            System.out.println("Enter your FirstName :");
            String firstName = scanner.next();
            System.out.println("Enter your LastName :");
            String lastName = scanner.next();
            System.out.println("Enter your Gender :");
            String gender = scanner.next();
            System.out.println("Enter your NationalCode :");
            int nationalCode = scanner.nextInt();
            System.out.println("Enter your BirthDate :");
            String birthDate = scanner.next();
            System.out.println("Enter your PhoneNumber :");
            String phoneNumber = scanner.next();

            Driver driver = new Driver(firstName, lastName, Gender.valueOf(gender.toUpperCase()), nationalCode, birthDate, phoneNumber);
            driverDatabaseAccess.save(driver);
        }
    }


    public static void addAGroupOfPassenger(int passengersNumber) throws SQLException, ClassNotFoundException {
        PassengerDatabaseAccess passengerDatabaseAccess = new PassengerDatabaseAccess();
        for (int i = 0; i < passengersNumber; i++) {
            System.out.println("Enter your FirstName :");
            String firstName = scanner.next();
            System.out.println("Enter your LastName :");
            String lastName = scanner.next();
            System.out.println("Enter your Gender :");
            String gender = scanner.next();
            System.out.println("Enter your NationalCode :");
            int nationalCode = scanner.nextInt();
            System.out.println("Enter your BirthDate :");
            String birthDate = scanner.next();
            System.out.println("Enter your PhoneNumber :");
            String phoneNumber = scanner.next();
            Passenger passenger = new Passenger(firstName, lastName, Gender.valueOf(gender.toUpperCase()), nationalCode, birthDate, phoneNumber);
            passengerDatabaseAccess.save(passenger);
        }
    }
//    public static void registerDriver (int driversNumber) throws SQLException, ClassNotFoundException{
//        System.out.println("Enter your FirstName :");
//        String firstName = scanner.next();
//        System.out.println("Enter your LastName :");
//        String lastName = scanner.next();
//        System.out.println("Enter your Gender :");
//        String gender = scanner.next();
//        System.out.println("Enter your NationalCode :");
//        int nationalCode = scanner.nextInt();
//        System.out.println("Enter your BirthDate :");
//        String birthDate = scanner.next();
//        System.out.println("Enter your PhoneNumber :");
//        String phoneNumber = scanner.next();
//        Driver driver = new Driver(firstName, lastName, Gender.valueOf(gender.toUpperCase()), nationalCode, birthDate, phoneNumber);
//        DriverDatabaseAccess
    }


