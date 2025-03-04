package com.itschool.session22;

@FunctionalInterface
public interface SimpleOperation {

    int sumOfStringsLength(String a, String b);

    default void someDefaultMethod() {
        System.out.println("something");
    }

}
