package org.example;

public class CupOfTea extends HotBeverage {

    private double temperature;
    public CupOfTea(String name, double cost, double volume, double temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "CupOfTea{" +
                "name = " + super.getName() + " " +
                "cost = " + super.getCost() + " " +
                "volume = " + super.getVolume() + " " +
                "temperature = " + temperature +
                '}';
    }
}
