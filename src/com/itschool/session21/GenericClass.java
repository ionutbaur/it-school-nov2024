package com.itschool.session21;

public class GenericClass<T, U, R> {

    private final T value;
    private final U middleValue;
    private final R rightValue;

    public GenericClass(T value, U middleValue, R rightValue) {
        this.value = value;
        this.middleValue = middleValue;
        this.rightValue = rightValue;
    }

    public T getValue() {
        return value;
    }

    public U getMiddleValue() {
        return middleValue;
    }

    public R getRightValue() {
        return rightValue;
    }
}
