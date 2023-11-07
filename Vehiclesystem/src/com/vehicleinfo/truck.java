package com.vehicleinfo;

public class truck {
	private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    public truck(String make, String model, int year, double cargoCapacity, String transmissionType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.cargoCapacity = cargoCapacity;
        this.transmissionType = transmissionType;
    }

    // Implement interface methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}

