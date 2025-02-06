package com.itschool.session15.course;

public class Main {

    public static void main(String[] args) {
        CarManager dieselCarManager = new DieselCarManager();
        dieselCarManager.manage();
        System.out.println("===============");

        AbstractCarManager abstractCarManager = new ElectricCarManager();
        abstractCarManager.manage();

        System.out.println("=============");

        CarManager petrolCarManager = new PetrolCarManager();
        petrolCarManager.manage();

        boolean isInstanceOfCarManager = dieselCarManager instanceof CarManager;
        System.out.println(isInstanceOfCarManager);
        boolean isInstanceOfDieselCarManager = dieselCarManager instanceof DieselCarManager;
        System.out.println(isInstanceOfDieselCarManager);
        boolean isInstanceOfPetrolCarManager = dieselCarManager instanceof PetrolCarManager;
        System.out.println(isInstanceOfPetrolCarManager);
    }
}
