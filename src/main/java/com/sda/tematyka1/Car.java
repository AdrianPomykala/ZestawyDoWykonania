package com.sda.tematyka1;

import java.time.LocalDate;

public class Car {
    private CarBrand brand;
    private String name;
    private CarType type;
    private double fuelUsage;
    private double engineCapacity;
    private int seatingCapacity;
    private int enginePower;
    private LocalDate manufactureDate;
    private boolean automaticTransmission;
    private Drivetrain drivetrain;

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", fuelUsage=" + fuelUsage +
                ", engineCapacity=" + engineCapacity +
                ", seatingCapacity=" + seatingCapacity +
                ", enginePower=" + enginePower +
                ", manufactureDate=" + manufactureDate +
                ", automaticTransmission=" + automaticTransmission +
                ", drivetrain=" + drivetrain +
                '}';
    }



    public Car(CarBrand brand, String name, CarType type, double fuelUsage, double engineCapacity, int seatingCapacity, int enginePower, LocalDate manufactureDate, boolean automaticTransmission, Drivetrain drivetrain) {

        this.brand = brand;
        this.name = name;
        this.type = type;
        this.fuelUsage = fuelUsage;
        this.engineCapacity = engineCapacity;
        this.seatingCapacity = seatingCapacity;
        this.enginePower = enginePower;
        this.manufactureDate = manufactureDate;
        this.automaticTransmission = automaticTransmission;
        this.drivetrain = drivetrain;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    public Drivetrain getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
    }
}
