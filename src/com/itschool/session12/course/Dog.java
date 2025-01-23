package com.itschool.session12.course;

public class Dog {

    // states/attributes
    int age;
    String breed;
    String color;

    // behaviours
    public void bark() {
        System.out.println("The dog barks");
    }

    protected void protectedMethod() {
        System.out.println("Some protected method");
    }

    private void privateMethod() {
        System.out.println("Some private method");
    }

    void eat() {
        System.out.println("The dog eats");
        privateMethod();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
