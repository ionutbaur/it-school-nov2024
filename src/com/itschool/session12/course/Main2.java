package com.itschool.session12.course;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Window seaViewWindow = createWindow("green", 2, 1);
        Window mountainViewWindow = createWindow("yellow", 4, 3);
        Window window3 = createWindow("blue", 10, 5);
        List<Window> windows = createWindowsList(seaViewWindow, mountainViewWindow, window3);

        House myHouse = createHouse(10, 20, true, windows);
        //myHouse.description = "myHouse desc";
        House.name = "myHouse name";
        myHouse.checkVars();

        /*System.out.println("My house has the length: " + myHouse.length);
        System.out.println("My house: " + myHouse);*/

        /*System.out.println("My house has number of windows: " + myHouse.windows.size());
        System.out.println("mountainViewWindow has the color: " + myHouse.windows.get(1).color);
        List<Window> myHouseWindows = myHouse.windows;
        Window windowFromIndex1 = myHouseWindows.get(1);
        String windowFromIndex1Color = windowFromIndex1.color;
        System.out.println("windowFromIndex1Color: " + windowFromIndex1Color);*/

        House neighbourHouse = createHouse(0, 50, false, null);
        neighbourHouse.checkVars();

        System.out.println("Neighbour's house is: " + neighbourHouse);

        int result = House.sum(3, 5);
        System.out.println(result);

        int mp2 = myHouse.mp2();
        System.out.println(mp2);

        int mp2vecin = neighbourHouse.mp2();
        System.out.println(mp2vecin);
    }

    private static House createHouse(int latime,
                                     int lungime,
                                     boolean areToateUtilitatile,
                                     List<Window> ferestre) {
        House house = new House(null, lungime, latime, ferestre, areToateUtilitatile);
        House.name = "ceva";

        return house;
    }

    private static Window createWindow(String culoare, int lungime, int latime) {
        Window window = new Window();
        window.color = culoare;
        window.length = lungime;
        window.width = latime;

        return window;
    }

    private static List<Window> createWindowsList(Window... ferestre) {
        List<Window> windowsList = new ArrayList<>();
        for (Window fereastra : ferestre) {
            windowsList.add(fereastra);
        }

        return windowsList;
    }
}
