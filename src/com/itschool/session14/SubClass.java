package com.itschool.session14;

public class SubClass extends SuperClass {

    public SubClass(String someVariable, String someVar2) {
        super(someVariable, someVar2);
    }

    public SubClass() {
        super("string1", "string2");
    }

    public SubClass(String someVariable) {
        super(someVariable);
    }

    protected String someVariable = "sub value";

    @Override
    protected void someMethod() {
        int a = 3;
        int b = 7;
        System.out.println(a + b);
        System.out.println("ce vrea muschiul meu");
    }

    /*protected void someFinalMethod() {
        // won't work because someFinalMethod in super is final
    }*/

    protected static void staticMethod() {
        System.out.println("some static method in sub class");
    }

    public void invokeMySomeMethod() {
        System.out.println(this.someVariable);
        System.out.println(this.someVar2);
        someMethod();
    }

    public void invokeSuperSomeMethod() {
        System.out.println(super.someVariable);
        System.out.println(someVar2);
        super.someMethod();
    }

}
