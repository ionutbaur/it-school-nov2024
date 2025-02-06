package com.itschool.session15.course;

public interface CanBurrow extends MyInterf1, MyInterf2 {

    int MINIMUM_DEPTH = 2;

    int maximumDepth();

    @Override
    default String someDefaultMethod() {
        return MyInterf2.super.someDefaultMethod();
    }
}
