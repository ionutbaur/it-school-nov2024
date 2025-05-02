package com.itschool.session39.singleton.eager;

public class MainEagerSingleton {

    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        EagerSingleton singleton3 = EagerSingleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

        singleton1.printMessage();
        singleton2.printMessage();
        singleton3.printMessage();
    }
}
