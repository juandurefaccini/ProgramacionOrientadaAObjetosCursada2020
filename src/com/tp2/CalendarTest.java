package com.tp2;

import java.util.Calendar;

public class CalendarTest {
    Calendar rightNow = Calendar.getInstance();

    public String getRightNow() {
        return rightNow.toString();
    }

    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance(); //Hora actual
        System.out.println(rightNow.getTime());
        System.out.println(rightNow.get(Calendar.YEAR));
        System.out.println(rightNow.get(Calendar.MONTH));  //devuelve un mes menos
        System.out.println(rightNow.get(Calendar.DAY_OF_MONTH));
        rightNow.set(Calendar.MONTH, 5);
        rightNow.set(Calendar.DAY_OF_MONTH, 5);
        rightNow.set(Calendar.YEAR, 5);
        System.out.println(rightNow.getTime());
    }
}
