package com.neatcode.designpattern.objectpool;

public class Car {
    private String licensePlate;
    private boolean available;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.available = true;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
