package com.itschool.session12.course;

// caller for Dog class's methods
public class MainForDog {

    public static void main(String[] args) {
        Dog azor = new Dog();
        azor.color = "white";
        azor.age = 1;
        azor.breed = "ciobanesc";

        System.out.println(azor);
        azor.bark();
        azor.eat();
        azor.protectedMethod();
        //azor.privateMethod();

        someMethod();
    }

    static void someMethod() {

    }
}
