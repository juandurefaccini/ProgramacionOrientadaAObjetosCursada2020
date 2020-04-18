package com.tp2;

public class ElectricalAppliance {
    String name;
    double base_price;
    String colour;
    int energy_consumption; // [Kw]
    int weight; // [Kg]

    public ElectricalAppliance() {
        colour = "grey_silver";
        energy_consumption = 10;
        base_price = 100;
        weight = 2;
    }

    public ElectricalAppliance(String name) {
        this.name = name;
        colour = "grey_silver";
        energy_consumption = 10;
        base_price = 100;
        weight = 2;
    }

    public ElectricalAppliance(String name, String colour) {
        this.name = name;
        this.colour = colour;
        energy_consumption = 10;
        base_price = 100;
        weight = 2;
    }

    public ElectricalAppliance(String name, String colour, int energy_consumption) {
        this.name = name;
        this.colour = colour;
        this.energy_consumption = energy_consumption;
        base_price = 100;
        weight = 2;
    }

    public ElectricalAppliance(String name, String colour, int energy_consumption, int base_price) {
        this.name = name;
        this.colour = colour;
        this.energy_consumption = energy_consumption;
        this.base_price = base_price;
        weight = 2;
    }

    public ElectricalAppliance(String name, String colour, int energy_consumption, int base_price, int weight) {
        this.name = name;
        this.colour = colour;
        this.energy_consumption = energy_consumption;
        this.base_price = base_price;
        this.weight = weight;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEnergy_consumption(int energy_consumption) {
        this.energy_consumption = energy_consumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getBase_price() {
        return base_price;
    }

    public String getColour() {
        return colour;
    }

    public int getEnergy_consumption() {
        return energy_consumption;
    }

    public int getWeight() {
        return weight;
    }

    public boolean energyEfficientAppliance() {
        return getEnergy_consumption() < 45;
    }

    public double getBalance() {
        return getBase_price() / getWeight();
    }

    public boolean highEndProduct() {
        return getBalance() > 3;
    }

    public static void main(String[] args) {
        ElectricalAppliance device1 = new ElectricalAppliance("toaster", "red", 30, 4000, 20);
        System.out.println(device1.energyEfficientAppliance());
        System.out.println(device1.getBalance());
        System.out.println(device1.highEndProduct());
    }
}
