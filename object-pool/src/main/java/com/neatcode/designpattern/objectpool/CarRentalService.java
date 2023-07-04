package com.neatcode.designpattern.objectpool;

import java.util.Optional;

public class CarRentalService extends ObjectPool<Car> {
    private int maxCars;

    public CarRentalService(int maxCars) {
        this.maxCars = maxCars;
    }

    @Override
    protected Optional<Car> create() {
        if (this.getInventorySize() < maxCars) {
            String randomLicensePlate = "IN 01 AA " + getInventorySize() + 1;
            Car newCar = new Car(randomLicensePlate);
            return Optional.ofNullable(newCar);
        };
        return Optional.empty();
    }
}
