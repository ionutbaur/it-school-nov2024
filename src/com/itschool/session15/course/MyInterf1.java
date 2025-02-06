package com.itschool.session15.course;

public interface MyInterf1 {

    int SOME_MEMBER = 3;

    void someMethod1();

    int someMethod2();

    default String someDefaultMethod() {
        somePrivateMethod();
        return "someString";
    }

    private void somePrivateMethod() {
        System.out.println("some private method");
        someStaticMethod();
    }

    static void someStaticMethod() {
        System.out.println(SOME_MEMBER);
        // somePrivateMethod(); does not work because non-static
    }
}
