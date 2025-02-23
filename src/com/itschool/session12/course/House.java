package com.itschool.session12.course;

import java.util.List;

public class House {

    static {
        System.out.println("Static block started");
        // description = "baur"; doesn't work because is not static
        name = "gabriel";
    }

    {
        System.out.println("This should be fired at each instance creation");
        description = "ionutz";
        name = "bla";
    }

    static String name;
    String description;
    int length;
    int width;
    List<Window> windows;
    boolean hasAlUtilities;

    public House() {
        System.out.println("Entered in non-arg constructor.");
        //description = "some description";
    }

    public House(int length, int width, List<Window> windows) {
        this();
        this.length = length;
        this.width = width;
        this.windows = windows;
        System.out.println("Entered in contructor with 3 arguments.");
    }

    public House(String description,
                 int length,
                 int width,
                 List<Window> windows,
                 boolean hasAlUtilities) {
        this(length, width, windows);
        this.description = description;
        this.hasAlUtilities = hasAlUtilities;
        System.out.println("Entered in constructor with all arguments.");
    }

    public void checkVars() {
        if (this.description == null) {
            System.out.println("Description is null");
        } else {
            System.out.println("Description is: " + description);
        }

        if (name == null) {
            System.out.println("Name is null");
        } else {
            System.out.println("Name is: " + name);
        }
    }

    protected int mp2() {
        return length * width;
    }

    protected static int sum(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ",description='" + description + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", windows=" + windows +
                ", hasAlUtilities=" + hasAlUtilities +
                '}';
    }
}
