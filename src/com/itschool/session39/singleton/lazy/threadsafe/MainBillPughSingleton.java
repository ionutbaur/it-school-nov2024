package com.itschool.session39.singleton.lazy.threadsafe;

public class MainBillPughSingleton {

    public static void main(String[] args) {
        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
        BillPughSingleton singleton2 = BillPughSingleton.getInstance();
        BillPughSingleton singleton3 = BillPughSingleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
