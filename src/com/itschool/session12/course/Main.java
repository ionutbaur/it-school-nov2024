package com.itschool.session12.course;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.width = 10;
        myHouse.length = 20;
        myHouse.hasAlUtilities = true;
        myHouse.windows = new ArrayList<>();

        Window seaViewWindow = new Window();
        seaViewWindow.color = "green";
        seaViewWindow.length = 2;
        seaViewWindow.width = 1;
        myHouse.windows.add(seaViewWindow);

        Window mountainViewWindow = new Window();
        mountainViewWindow.color = "yellow";
        mountainViewWindow.length = 4;
        mountainViewWindow.width = 3;
        myHouse.windows.add(mountainViewWindow);

        System.out.println("My house has the length: " + myHouse.length);
        System.out.println("My house: " + myHouse);

        System.out.println("My house has number of windows: " + myHouse.windows.size());
        System.out.println("mountainViewWindow has the color: " + myHouse.windows.get(1).color);
        List<Window> myHouseWindows = myHouse.windows;
        Window windowFromIndex1 = myHouseWindows.get(1);
        String windowFromIndex1Color = windowFromIndex1.color;
        System.out.println("windowFromIndex1Color: " + windowFromIndex1Color);

        House neighbourHouse = new House();
        neighbourHouse.length = 50;

        System.out.println("Neighbour's house is: " + neighbourHouse);
    }
}
