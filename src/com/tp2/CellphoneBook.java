package com.tp2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.*;

public class CellphoneBook {
    List<Contact> contactList = new ArrayList<>();
    List<Contact> duplicatedContactList = new ArrayList<>(); //Contains all duplicated contacts

    public CellphoneBook() {

    }

    public List getDuplicatedContactsList() {
        List<Contact> aux = new ArrayList<>();
        for (Contact contact : duplicatedContactList) {
            aux.add(contact);
        }
        return aux;
    }

    private boolean isRepeated(Contact contact) {
        for (Contact co : contactList) { //En vez de utilizar el contains uso este metodo
            if (co.getName().equals(contact.getName()) &&
                    co.getLast_name().equals(contact.getLast_name()) &&
                    co.getNumber() == contact.getNumber()) {
                return true;
            }
        }
        return false;
    }

    public void addContact(Contact contact) {
        if (this.isRepeated(contact)) {
            duplicatedContactList.add(contact);
        } else {
            contactList.add(contact);
        }
    }

    public List getContactList() {
        List<Contact> aux = new ArrayList<>(); //todo modularize
        for (Contact contact : contactList) {
            aux.add(contact);
        }
        return aux;
    }

    public double getAgeProm() {
        int ageSum = 0;
        for (Contact contact : contactList) {
            //ageSum=+contact.getDate_of_birth().until(LocalDate.now(),Year);
            ageSum += YEARS.between(contact.getDate_of_birth(), LocalDate.now());
        }
        return ageSum / contactList.size();
    }

    public void removeContact(Contact contact) {
        contactList.remove(contact);
    }

    public static void main(String[] args) {
        LocalDate b1 = LocalDate.of(1999, 3, 11);
        LocalDate b2 = LocalDate.of(1989, 3, 11);
        LocalDate b3 = LocalDate.of(1979, 3, 11);
//        LocalTime b1 = new LocalTime(1999,3,11);
        Contact c1 = new Contact("Juan", "Perez", 0,
                b1, "Ayolas 6707");
        Contact c2 = new Contact("Juan", "Perez", 0,
                b2, "Ayolas 6707");
        Contact c3 = new Contact("Juan", "Perez", 0,
                b3, "Ayolas 6707");
        CellphoneBook cpb = new CellphoneBook();
        cpb.addContact(c1);
        cpb.addContact(c2);
        cpb.addContact(c3);
        cpb.addContact(c3);
        cpb.addContact(c3);
        System.out.println(cpb.getAgeProm());
        System.out.println(cpb.getContactList());
        System.out.println(cpb.getDuplicatedContactsList());
    }
}
