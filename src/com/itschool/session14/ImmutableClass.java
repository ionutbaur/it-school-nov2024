package com.itschool.session14;

public final class ImmutableClass {

    private final String someString;
    private final int someInt;

    public ImmutableClass(String someString, int someInt) {
        this.someString = someString;
        this.someInt = someInt;
    }

    public String getSomeString() {
        return someString;
    }

    public int getSomeInt() {
        return someInt;
    }

    // won't work because this.someString is final
    /*public void setSomeString(String someString) {
        this.someString = someString;
    }*/
}
