package com.itschool.session12.homework.ex1;

import java.time.LocalDate;

public class Student {

    String firstName;
    String lastName;
    String sex;
    int age;
    LocalDate dateOfBirth;
    long cnp;
    String address;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", cnp=" + cnp +
                ", address='" + address + '\'' +
                '}';
    }
}
