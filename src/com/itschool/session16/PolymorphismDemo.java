package com.itschool.session16;

public class PolymorphismDemo {

    public static void main(String[] args) {
        int result = PolymorphismDemo.add(5, 7);
        int result2 = PolymorphismDemo.add(1, 3, 2);
        System.out.println(result);
        System.out.println(result2);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }
}
