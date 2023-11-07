package com.vehicleinfo;

public class car {
	private String make;
    private String model;
    private int year;
    private int numDoors;
    private String fuelType;

    public car(String make, String model, int year, int numDoors, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numDoors = numDoors;
        this.fuelType = fuelType;
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

    public int getNumDoors() {
        return numDoors;
    }

    public String getFuelType() {
        return fuelType;
    }
}