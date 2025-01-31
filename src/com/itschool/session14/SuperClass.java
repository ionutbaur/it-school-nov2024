package com.itschool.session14;

public class SuperClass {

    public SuperClass(String someVariable, String someVar2) {
        this.someVariable = someVariable;
        this.someVar2 = someVar2;
    }

    public SuperClass(String someVariable) {
        this.someVariable = someVariable;
    }

    protected String someVariable = "super value";
    protected String someVar2 = "super val2";

    protected final void someFinalMethod() {
        System.out.println("final method in super class");
    }

    protected void someMethod() {
        System.out.println("Some method from Super class");
    }

    protected static void staticMethod() {
        System.out.println("some static method in super class");
    }

}
