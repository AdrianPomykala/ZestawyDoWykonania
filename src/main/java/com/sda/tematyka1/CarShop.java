package com.sda.tematyka1;

import java.util.ArrayList;
import java.util.List;

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
}

