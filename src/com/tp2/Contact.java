package com.tp2;

import java.time.LocalDate;

public class Contact {
    String name;
    String last_name;
    LocalDate date_of_birth;
    int number;
    String address;

    public Contact() {
        name = "n";
        last_name = "n";
        date_of_birth = LocalDate.of(0, 0, 0); //Incializo en 0000/0/0
        number = 0;
        address = "n";
    }

    public Contact(String name, String last_name, int number) {
        this.name = name;
        this.last_name = last_name;
        date_of_birth = LocalDate.of(0, 0, 0); //Incializo en 0000/0/0
        this.number = number;
        address = "n";
    }

    public Contact(String name, String last_name, int number, LocalDate date_of_birth, String address) {
        this.name = name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.number = number;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", number=" + number +
                ", address='" + address + '\'' +
                '}' + "\n";
    }
}
