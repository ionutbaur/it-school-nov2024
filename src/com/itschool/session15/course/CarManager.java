package com.itschool.session15.course;

public abstract class CarManager {

    private void parkCar() {
        System.out.println("Park the car");
    }

    private final void washCar() {
        System.out.println("Wash the car");
    }

    protected abstract void fuelCar();

    public final void manage() {
        parkCar();
        washCar();
        fuelCar();
    }
}
