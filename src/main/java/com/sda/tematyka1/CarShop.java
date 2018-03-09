package com.sda.tematyka1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarShop {
    private String name;
    private List<CarOffer> carOffers;

    public CarShop(String name, List<CarOffer> carOffers) {
        this.name = name;
        this.carOffers = carOffers;
    }

    public CarShop(String name) {
        this.name = name;
        this.carOffers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCarOffers(CarOffer... carOffers) {
        Collections.addAll(this.carOffers, carOffers);
    }

    public List<CarOffer> getCarOffers() {
        return carOffers;
    }

    public List<Car> getCars() {
        return carOffers.stream().map(carOffer -> carOffer.getCar()).collect(Collectors.toList());
    }
    public List<CarBrand> getCarBrands() {
        return carOffers.stream().map(offers -> offers.getCar().getBrand())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Car> getAWDCars() {
        return carOffers.stream()
                .map(carOffer -> carOffer.getCar())
                .filter(car -> car.getDrivetrain().equals(Drivetrain.AWD))
                .collect(Collectors.toList());
    }
}

