package com.itschool.session21;

public class MainForEnum {

    public static void main(String[] args) {
        /*System.out.println(SeasonEnhanced.SPRING);
        SeasonEnhanced seasonEnhanced = SeasonEnhanced.AUTUMN;
        System.out.println(seasonEnhanced);

        // won't work because IONUTZ is not a value from SeasonEnhanced
        //SeasonEnhanced seasonEnhanced2 = SeasonEnhanced.valueOf("IONUTZ");
        SeasonEnhanced seasonEnhanced2 = SeasonEnhanced.valueOf("WINTER");
        System.out.println(seasonEnhanced2);

        System.out.println("==============all values:");

        SeasonEnhanced[] seasons = SeasonEnhanced.values();
        for (SeasonEnhanced season : seasons) {
            System.out.println(season.getCalendarPosition());
        }

        System.out.println(SeasonEnhanced.AUTUMN.getMonths());*/

        SeasonEnhanced winter1 = SeasonEnhanced.WINTER;
        SeasonEnhanced winter2 = SeasonEnhanced.WINTER;

        System.out.println(winter1.equals(winter2));
        System.out.println(winter1 == winter2);

        String someVar = "WINTER";

        System.out.println(winter1.equals(someVar)); //always false
        //System.out.println(winter1 == someVar); won't compile
    }
}
