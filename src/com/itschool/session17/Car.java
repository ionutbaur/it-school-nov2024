package com.itschool.session17;

public class Car extends Vehicle {

    public void engineSound() {
        System.out.println("A V12 nice car");
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }
}
