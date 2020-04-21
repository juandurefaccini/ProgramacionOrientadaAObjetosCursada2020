package com.tp2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Meeting {
    String place;
    List<Person> personList = new ArrayList<>();
    String topic;
    Calendar start = Calendar.getInstance(); //todo restriccion de horario 9:00hs to 19:00hs
    Calendar end = Calendar.getInstance();

    public Meeting() {
        place = "n";
        topic = "n";
    }

    public Meeting(String place) {
        this.place = place;
        topic = "n";
    }

    public Meeting(String place, String topic) { //todo preguntar como hacer para copiar la lista
        this.place = place;
        this.topic = topic;
    }

    public Meeting(String place, String topic, Calendar start, Calendar end) {
        this.place = place;
        this.topic = topic;
        //todo verificar que estan en el mismo dia
        this.start.set(start.get(Calendar.YEAR), start.get(Calendar.MONTH), start.get(Calendar.DAY_OF_MONTH), start.get(Calendar.HOUR_OF_DAY), 0);
        this.end.set(start.get(Calendar.YEAR), end.get(Calendar.MONTH), end.get(Calendar.DAY_OF_MONTH), end.get(Calendar.HOUR_OF_DAY), 0);
    }

    public Calendar getStart() {
        return start;
    }

    public Calendar getEnd() {
        return end;
    }

    public int getDuration() {
        return end.get(Calendar.HOUR_OF_DAY) - start.get(Calendar.HOUR_OF_DAY);
    }

    public void addParticipant(Person person) {
        personList.add(person);
    }

    public void removeParticipant(Person person) {
        personList.remove(person);
    }

    public String getParticipants() {
        return personList.toString();
    }

    public boolean overlap(Meeting met) {
        return !(met.getEnd().compareTo(start) <= 0 | met.getStart().compareTo(end) >= 0);
    }

    @Override
    public String toString() {
        getDuration();
        return "Meeting{" +
                "place='" + place + '\'' +
                ", personList=" + personList +
                ", topic='" + topic + '\'' +
                ", duration=" + getDuration() +
                ", start=" + start +
                ", end=" + end +
                '}';
    }

    public static void main(String[] args) {
        Calendar fecha1 = new GregorianCalendar(1999, 3, 11, 10, 0);
        Calendar fecha2 = new GregorianCalendar(1999, 3, 11, 12, 0);
        Person pe = new Person("juan", "dure", "2234977214", "juanchidure@outlook.com");
        Person pe2 = new Person("juan2", "dure2", "2234977214", "juanchidure@outlook.com");
        Person pe3 = new Person("juan23", "dure23", "2234977214", "juanchidure@outlook.com");
        Meeting meet = new Meeting("casa", "virgojuntada", fecha1, fecha2);
        System.out.println(meet.getStart().getTime());
        System.out.println(meet.getEnd().getTime());
        meet.addParticipant(pe);
        meet.addParticipant(pe2);
        meet.addParticipant(pe3);
        System.out.println(meet.toString());

    }

}
