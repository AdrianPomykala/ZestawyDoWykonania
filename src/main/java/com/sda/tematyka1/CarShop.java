package com.sda.tematyka1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public List<Car> getCarsNewestThan(String manufactureDate){
//        String chars[] = manufactureDate.toCharArray();
        //  System.out.println(manufactureDate.substring(0,2));
        LocalDate date;
        try{
            date = LocalDate.of(Integer.parseInt(manufactureDate.substring(0, 4)),
                    Integer.parseInt(manufactureDate.substring(6, 7)),
                    Integer.parseInt(manufactureDate.substring(9, 10)));
            return carOffers.stream()
                    .map(carOffer -> carOffer.getCar())
                    .filter(car -> car.getManufactureDate().isAfter(date))
                    .collect(Collectors.toList());
        }catch(NumberFormatException | DateTimeException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    public List<Car> getCarsOfBrand(String brand){
        try {
            CarBrand carBrand = CarBrand.valueOf(brand);
            return carOffers.stream()
                    .map(carOffer -> carOffer.getCar())
                    .filter(car -> car.getBrand().equals(carBrand))
                    .collect(Collectors.toList());
        } catch(IllegalArgumentException iae){
            System.err.println("Podano złą markę");
        }
        return null;
    }

    public List<Car> getCarsFuelUsageSort() {
        return carOffers.stream()
                .map(carOffer -> carOffer.getCar())
                .sorted(Comparator.comparing(Car::getFuelUsage))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsEnginePowerSort() {
        return carOffers.stream()
                .map(carOffer -> carOffer.getCar())
                .sorted(Comparator.comparing(Car::getEnginePower).reversed())
                .collect(Collectors.toList());
    }

    public List<CarOffer> getCarOffersPriceSort() {
        return carOffers.stream()
                .sorted(Comparator.comparing(CarOffer::getPurchasePrice))
                .collect(Collectors.toList());
    }

    public List<CarOffer> getCheapestRentalOffer() {
        int minRentalPrice = carOffers.stream()
                .mapToInt(carOff -> carOff.getRentalPrice())
                .min().getAsInt();
        return carOffers.stream()
                .filter(carOffer -> carOffer.getRentalPrice() == minRentalPrice)
                .collect(Collectors.toList());
    }



    private Comparator<CarOffer> comparator = (o1, o2) -> {
        if (o1.getCar().getEnginePower() > o2.getCar().getEnginePower()) {
            return 1;
        } else if (o2.getCar().getEnginePower() > o1.getCar().getEnginePower()) {
            return -1;
        }
        return 0;
    };

    public List<CarOffer> getCheapestAndMostPowerfulCarOffer(){
        int lowestPurchasePrice = carOffers.stream()
                .mapToInt(carOffer -> carOffer.getPurchasePrice())
                .min().getAsInt();
        int highestEnginePower = carOffers.stream()
                .filter(carOffer -> carOffer.getPurchasePrice()==lowestPurchasePrice)
                .max(comparator).get().getCar().getEnginePower();
        return carOffers.stream()
                .filter(carOffer -> carOffer.getPurchasePrice() == lowestPurchasePrice && carOffer.getCar().getEnginePower()==highestEnginePower)
                .collect(Collectors.toList());
    }
}

