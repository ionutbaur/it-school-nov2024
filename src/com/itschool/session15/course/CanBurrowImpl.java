package com.itschool.session15.course;

public class CanBurrowImpl implements CanBurrow, BankingService {
    @Override
    public void someMethod1() {
        System.out.println("from CanBurrowImpl");
    }

    @Override
    public int someMethod2() {
        return 0;
    }

    @Override
    public int maximumDepth() {
        return 0;
    }

    @Override
    public String anotherMethod() {
        return "";
    }

    @Override
    public void pay() {

    }
}
