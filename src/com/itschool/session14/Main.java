package com.itschool.session14;

public class Main {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.invokeMySomeMethod();
        System.out.println("===========");
        subClass.invokeSuperSomeMethod();

        SuperClass.staticMethod();

        SubClass.staticMethod();
    }
}
