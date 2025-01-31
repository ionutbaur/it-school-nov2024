package com.itschool.session12.homework.ex1;

public non-sealed class Student extends Person {

    private String marks;
    private String book;

    public void someMethod() {
        setSex("M");
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
