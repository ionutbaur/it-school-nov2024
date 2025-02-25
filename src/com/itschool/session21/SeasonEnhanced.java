package com.itschool.session21;

import java.time.Month;
import java.util.List;

public enum SeasonEnhanced {

    WINTER(4, List.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY)),
    SUMMER(2, List.of(Month.JUNE, Month.JULY, Month.AUGUST)),
    SPRING(1, List.of(Month.MARCH, Month.APRIL, Month.MAY)),
    AUTUMN(3, List.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER));

    private final int calendarPosition;
    private final List<Month> months;

    SeasonEnhanced(int calendarPosition, List<Month> months) {
        this.calendarPosition = calendarPosition;
        this.months = months;
    }

    public int getCalendarPosition() {
        return calendarPosition;
    }

    public List<Month> getMonths() {
        return months;
    }

}
