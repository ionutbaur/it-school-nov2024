package com.itschool.session15.course;

public interface MyInterf2 {

    String anotherMethod();

    default String someDefaultMethod() {
        return "someString from MyInterf2";
    }
}
