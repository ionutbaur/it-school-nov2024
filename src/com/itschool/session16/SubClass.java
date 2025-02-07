package com.itschool.session16;

public class SubClass extends SuperClass {

    protected int number = 10;

    public void printNumber() {
        System.out.println(number);
        //System.out.println(super.number);
    }

    @Override
    protected void someMethod() {
        System.out.println("Some Method from sub class");
    }
}
