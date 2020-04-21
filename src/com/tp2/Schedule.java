package com.tp2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Schedule {
    String name;
    List<Meeting> meetingList = new ArrayList<>();

    public Schedule(String name) {
        this.name = name;
    }

    public boolean addMeeting(Meeting met) {//todo optimizar
        for (Meeting me : meetingList) {
            if (met.overlap(me)) {
                return false;
            }
        }
        meetingList.add(met);
        return true;
    }

    public static void main(String[] args) {
        Schedule sch = new Schedule("juan");
        Meeting uno = new Meeting("",
                "",
                new GregorianCalendar(2010, 3, 11, 10, 0),
                new GregorianCalendar(2010, 3, 11, 13, 0));
        System.out.println(sch.addMeeting(uno));
        Meeting dos = new Meeting("",
                "",
                new GregorianCalendar(2010, 3, 11, 9, 0),
                new GregorianCalendar(2010, 3, 11, 13, 0));
        System.out.println(sch.addMeeting(dos));
    }


}


