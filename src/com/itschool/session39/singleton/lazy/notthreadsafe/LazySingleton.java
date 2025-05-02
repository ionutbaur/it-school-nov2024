package com.itschool.session39.singleton.lazy.notthreadsafe;

public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {
        System.out.println("Constructor of LazySingleton " + this);
    }

    public static /*synchronized*/ LazySingleton getInstance() {
        System.out.println("invoked getInstance in LazySingleton");
        if (INSTANCE == null) {
            System.out.println("First time. Initializing singleton");
            INSTANCE = new LazySingleton();
        }

        return INSTANCE;
    }

    public void printMessage() {
        System.out.println("Hello from LazySingleton");
    }
}
