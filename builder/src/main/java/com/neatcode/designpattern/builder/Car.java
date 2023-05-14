package com.neatcode.designpattern.builder;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String engine;
    private String transmission;
    private String fuelType;
    private boolean hasGPS;
    private boolean hasBluetooth;
    private boolean hasBackupCamera;
    private boolean hasHeatedSeats;
    private boolean hasSunroof;
    private boolean hasPremiumSoundSystem;
    private boolean hasThirdRowSeating;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHasBackupCamera() {
        return hasBackupCamera;
    }

    public void setHasBackupCamera(boolean hasBackupCamera) {
        this.hasBackupCamera = hasBackupCamera;
    }

    public boolean isHasHeatedSeats() {
        return hasHeatedSeats;
    }

    public void setHasHeatedSeats(boolean hasHeatedSeats) {
        this.hasHeatedSeats = hasHeatedSeats;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public boolean isHasPremiumSoundSystem() {
        return hasPremiumSoundSystem;
    }

    public void setHasPremiumSoundSystem(boolean hasPremiumSoundSystem) {
        this.hasPremiumSoundSystem = hasPremiumSoundSystem;
    }

    public boolean isHasThirdRowSeating() {
        return hasThirdRowSeating;
    }

    public void setHasThirdRowSeating(boolean hasThirdRowSeating) {
        this.hasThirdRowSeating = hasThirdRowSeating;
    }

    private Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.fuelType = builder.fuelType;
        this.hasGPS = builder.hasGPS;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasBackupCamera = builder.hasBackupCamera;
        this.hasHeatedSeats = builder.hasHeatedSeats;
        this.hasSunroof = builder.hasSunroof;
        this.hasPremiumSoundSystem = builder.hasPremiumSoundSystem;
        this.hasThirdRowSeating = builder.hasThirdRowSeating;
    }

    public static class CarBuilder {
        private String make;
        private String model;
        private int year;
        private String color;
        private String engine;
        private String transmission;
        private String fuelType;
        private boolean hasGPS;
        private boolean hasBluetooth;
        private boolean hasBackupCamera;
        private boolean hasHeatedSeats;
        private boolean hasSunroof;
        private boolean hasPremiumSoundSystem;
        private boolean hasThirdRowSeating;

        public CarBuilder(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder transmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder fuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public CarBuilder hasGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public CarBuilder hasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public CarBuilder hasBackupCamera(boolean hasBackupCamera) {
            this.hasBackupCamera = hasBackupCamera;
            return this;
        }

        public CarBuilder hasHeatedSeats(boolean hasHeatedSeats) {
            this.hasHeatedSeats = hasHeatedSeats;
            return this;
        }

        public CarBuilder hasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public CarBuilder hasPremiumSoundSystem(boolean hasPremiumSoundSystem) {
            this.hasPremiumSoundSystem = hasPremiumSoundSystem;
            return this;
        }

        public CarBuilder hasThirdRowSeating(boolean hasThirdRowSeating) {
            this.hasThirdRowSeating = hasThirdRowSeating;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
