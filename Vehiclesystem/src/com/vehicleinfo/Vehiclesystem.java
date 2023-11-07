package com.vehicleinfo;

import java.util.Scanner;

public class Vehiclesystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vehicle Information System");

        // Create and display vehicle objects
        car car = createCar(scanner);
        displayCarDetails(car);

        motor motor = createMotor(scanner);
        displayMotorDetails(motor);

        truck truck = createTruck(scanner);
        displayTruckDetails(truck);
    }

    // Method to create a Car object
    public static car createCar(Scanner scanner) {
        System.out.println("Enter car details:");
        System.out.print("Make: ");
        String make = scanner.next();
        System.out.print("Model: ");
        String model = scanner.next();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Number of Doors: ");
        int numDoors = scanner.nextInt();
        System.out.print("Fuel Type: ");
        String fuelType = scanner.next();

        return new car(make, model, year, numDoors, fuelType);
    }

    // Method to create a Motorcycle object
    public static motor createMotor(Scanner scanner) {
        System.out.println("Enter motorcycle details:");
        System.out.print("Make: ");
        String make = scanner.next();
        System.out.print("Model: ");
        String model = scanner.next();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Number of Wheels: ");
        int numWheels = scanner.nextInt();
        System.out.print("Motorcycle Type: ");
        String motorcycleType = scanner.next();

        return new motor(make, model, year, numWheels, motorcycleType);
    }

    // Method to create a Truck object
    public static truck createTruck(Scanner scanner) {
        System.out.println("Enter truck details:");
        System.out.print("Make: ");
        String make = scanner.next();
        System.out.print("Model: ");
        String model = scanner.next();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Cargo Capacity (in tons): ");
        double cargoCapacity = scanner.nextDouble();
        System.out.print("Transmission Type: ");
        String transmissionType = scanner.next();

        return new truck(make, model, year, cargoCapacity, transmissionType);
    }

    // Display vehicle details
    public static void displayCarDetails(car car) {
        System.out.println("Car Details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number of Doors: " + car.getNumDoors());
        System.out.println("Fuel Type: " + car.getFuelType());
    }

    // Method to display Motorcycle details
    public static void displayMotorDetails(motor motor) {
        System.out.println("Motorcycle Details:");
        System.out.println("Make: " + motor.getMake());
        System.out.println("Model: " + motor.getModel());
        System.out.println("Year: " + motor.getYear());
        System.out.println("Number of Wheels: " + motor.getNumWheels());
        System.out.println("Motorcycle Type: " + motor.getMotorcycleType());
    }

    // Method to display Truck details
    public static void displayTruckDetails(truck truck) {
        System.out.println("Truck Details:");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
        System.out.println("Transmission Type: " + truck.getTransmissionType());
    }
}
