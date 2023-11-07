package com.vehicleinfo;

public class motor {
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private String motorcycleType;

    public motor(String make, String model, int year, int numWheels, String motorcycleType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numWheels = numWheels;
        this.motorcycleType = motorcycleType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }
}
