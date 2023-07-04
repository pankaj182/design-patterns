package com.neatcode.designpattern.objectpool;

public class App {
    public static void main(String[] args) {
        var pool = new CarRentalService(3);
        System.out.println(pool);
        Car car1 = pool.request();
        System.out.println("Requested a car");
        System.out.println(pool);
        Car car2 = pool.request();
        System.out.println("Requested a car");
        System.out.println(pool);
        Car car3 = pool.request();
        System.out.println("Requested a car");
        System.out.println(pool);
        pool.release(car1);
        System.out.println("Released a car");
        System.out.println(pool);
        pool.release(car2);
        System.out.println("Released a car");
        System.out.println(pool);
        Car car4 = pool.request();
        System.out.println("Requested a car");
        System.out.println(pool);
        Car car5 = pool.request();
        System.out.println("Requested a car");
        System.out.println(pool);
    }
}
