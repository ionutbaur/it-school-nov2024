package com.itschool.session21;

import com.itschool.session20.Person;

public class GenericPerson<T extends Person> {

    private final T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
