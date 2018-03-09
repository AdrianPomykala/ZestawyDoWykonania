package com.sda.tematyka1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(CarBrand.BMW, "X5", CarType.SUV, 11.5, 3.0, 5,
                190, LocalDate.of(2011, 10, 15), true, Drivetrain.AWD);
        Car car2 = new Car(CarBrand.MERCEDES, "S", CarType.SEDAN, 14, 5.0, 5,
                330, LocalDate.of(2010, 11, 15), true, Drivetrain.RWD);
        Car car3 = new Car(CarBrand.MAZDA, "5", CarType.SUV, 8, 2.5, 5,
                130, LocalDate.of(2017, 5, 1), false, Drivetrain.FWD);
        Car car4 = new Car(CarBrand.TOYOTA, "Auris", CarType.HATCHBACK, 1.2, 3.0, 5,
                100, LocalDate.of(2018, 3, 11), false, Drivetrain.FWD);
        Car car5 = new Car(CarBrand.FIAT, "Tipo", CarType.SEDAN, 7, 1.6, 5,
                90, LocalDate.of(2005, 10, 15), false, Drivetrain.FWD);
        Car car6 = new Car(CarBrand.SKODA, "Superb", CarType.KOMBI, 9.5, 2.0, 5,
                210, LocalDate.of(2016, 7, 4), true, Drivetrain.AWD);
        Car car7 = new Car(CarBrand.AUDI, "A4", CarType.SUV, 9, 3.0, 5,
                170, LocalDate.of(2008, 3, 3), true, Drivetrain.AWD);
        Car car8 = new Car(CarBrand.FORD, "Focus", CarType.SUV, 7.5, 1.8, 5,
                160, LocalDate.of(2011, 7, 15), false, Drivetrain.FWD);
        Car car9 = new Car(CarBrand.HONDA, "Civic", CarType.SUV, 12, 2.5, 5,
                190, LocalDate.of(2012, 8, 16), true, Drivetrain.FWD);
        Car car10 = new Car(CarBrand.BMW, "Z3", CarType.CABRIO, 13, 4.4, 2,
                250, LocalDate.of(2018, 9, 17), true, Drivetrain.RWD);
    }
}
