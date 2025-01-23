package com.itschool.session12.course;

import java.util.List;

public class House {

    int length;
    int width;
    List<Window> windows;
    boolean hasAlUtilities;

    @Override
    public String toString() {
        return "House{" +
                "length=" + length +
                ", width=" + width +
                ", windows=" + windows +
                ", hasAlUtilities=" + hasAlUtilities +
                '}';
    }
}
