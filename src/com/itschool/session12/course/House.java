package com.itschool.session12.course;

import java.util.List;

public class House {

    static String name;
    String description;
    int length;
    int width;
    List<Window> windows;
    boolean hasAlUtilities;

    public void checkVars() {
        if (description == null) {
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
