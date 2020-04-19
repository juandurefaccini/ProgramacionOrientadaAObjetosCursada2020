package com.tp2;

public class Episode {
    String name;
    String description;
    boolean flag;
    int rate;

    public Episode() {
        name = "N";
        description = "N";
        flag = false;
        rate = -1;
    }

    public Episode(String name) {
        this.name = name;
        description = "N";
        flag = false;
        rate = -1;
    }

    public Episode(String name, String description) {
        this.name = name;
        this.description = description;
        flag = false;
        rate = -1;
    }

    public void setRate(int rate) {
        if (validRate(rate)) {
            this.rate = rate;
        } else {
            System.out.println("Please enter a valid rate between 0 and 5");
        }
    }

    private boolean validRate(int rate) {
        return rate > 0 && rate < 6;
    }

    public int getRate() {
        return (validRate(rate)) ? rate : 0;
    }

    public boolean getFlag() {
        return flag;
    }


}
