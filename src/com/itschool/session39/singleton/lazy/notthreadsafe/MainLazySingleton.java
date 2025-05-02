package com.itschool.session39.singleton.lazy.notthreadsafe;

public class MainLazySingleton {

    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        LazySingleton singleton3 = LazySingleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

        singleton1.printMessage();
        singleton2.printMessage();
        singleton3.printMessage();
    }
}
