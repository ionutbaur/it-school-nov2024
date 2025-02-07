package com.itschool.session17.solid;

// violates Liskov substitution
public class Square extends Rectangle {

    @Override
    public void setLength(int side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(int side) {
        super.setWidth(side);
        super.setLength(side);
    }
}
