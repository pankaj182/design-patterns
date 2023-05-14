package com.neatcode.designpattern.builder;

public class Application {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("Toyota", "Camry", 2022)
            .color("Red")
            .engine("V6")
            .transmission("Automatic")
            .fuelType("Gasoline")
            .hasGPS(true)
            .hasBluetooth(true)
            .hasBackupCamera(true)
            .hasHeatedSeats(true)
            .hasSunroof(false)
            .hasPremiumSoundSystem(false)
            .hasThirdRowSeating(false)
            .build();
        System.out.println("color = " + car.getColor());
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
    }
}
