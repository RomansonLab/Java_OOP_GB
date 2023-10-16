package org.example;

public abstract class HotBeverage {
    private String name;
    private double cost;
    private double volume;

    public HotBeverage(String name, double cost, double volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }
// Getter & setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "hotBeverage{" +
                "name= '" + name + '\'' +
                ", cost= " + cost +
                ", volume= " + volume +
                '}';
    }
}
