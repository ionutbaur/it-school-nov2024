package com.itschool.session39.singleton.eager;

public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Constructor in EagerSingleton " + this);
    }

    public static EagerSingleton getInstance() {
        System.out.println("invoked getInstance in EagerSingleton");
        return INSTANCE;
    }

    public void printMessage() {
        System.out.println("Hello from Eager singleton " + this);
    }
}
