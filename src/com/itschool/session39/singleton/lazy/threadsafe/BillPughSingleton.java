package com.itschool.session39.singleton.lazy.threadsafe;

public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("Constructor in Bill Pugh Singleton " + this);
    }

    private static class SingletonHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        System.out.println("invoked getInstance BillPughSingleton");
        return SingletonHolder.INSTANCE;
    }
}
