package com.itschool.session17;

import com.itschool.session16.SubClass;

public class ObjVsRef {

    public static void main(String[] args) {
        Vehicle car = new Car();
        //car.engineSound(); // won't work because class Vehicle doesn't contain engineSound()
        car.run();

        Car car2 = new Car();
        car2.engineSound();
        car2.run();

        System.out.println("=============");

        Object carObject = new Car();
        Car car1 = (Car) carObject;
        System.out.println("Checking instance of carObject:");
        checkInstance(carObject);

        System.out.println("#############");

        System.out.println("Checking instance of vehicle:");
        Vehicle vehicle = new Vehicle();
        checkInstance(vehicle);

        Car car3 = (Car) vehicle; // will fail because not an instance of Car
    }

    private static void checkInstance(Object obj) {
        if (obj instanceof Vehicle vehicle) {
            System.out.println("Instance of Vehicle. Proceed with Vehicle creation.");
            vehicle.run();
        } else {
            System.out.println("Not an instance of Vehicle");
        }
    }
}
