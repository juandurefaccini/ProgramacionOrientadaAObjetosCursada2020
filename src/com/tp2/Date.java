package com.tp2;
//to_do->get system clock

import javax.xml.stream.events.DTD;

public class Date{
    int day;
    int month;
    int year;

    public Date(int d,int m,int y){
        day=d;
        month=m;
        year=y;
    }
    public Date(){
        day=1;
        month=1;
        year=2000;
    }
    public void setDay(int d){day=d;}
    public void setMonth(int m){month=m;}
    public void setYear(int y){year=y;}

    public int getDay(){return day;}
    public int getMonth(){return month;}
    public int getYear(){return year;}

    public int getYearsToToday(){
        //currently 18/4/2020
        int age = 2020-getYear();
        age = (month < 4) ? age  : age-1;
        return age;
    }

    public int getHash(){
        //TODO implementar con if en cascada en vez de un codigo hash, hacer un .equals();
        return getDay() * 1000000 + getMonth() * 10000 + getYear();
    }
    public static void main(String[] args) {
        Date nac = new Date(11,4,1999);
        System.out.println(nac.getYearsToToday());
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
