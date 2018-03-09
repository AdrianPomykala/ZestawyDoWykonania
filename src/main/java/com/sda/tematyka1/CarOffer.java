package com.sda.tematyka1;

public class CarOffer {
    private Car car;
    private int purchasePrice;
    private int rentalPrice;

    @Override
    public String toString() {
        return "CarOffer{" + car +
                ", purchasePrice=" + purchasePrice +
                ", rentalPrice=" + rentalPrice +
                '}';
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public CarOffer(Car car, int purchasePrice, int rentalPrice) {

        this.car = car;
        this.purchasePrice = purchasePrice;
        this.rentalPrice = rentalPrice;
    }
}
