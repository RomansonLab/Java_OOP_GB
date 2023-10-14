package org.example;

public interface IVendingMachine {

    public HotBeverage getHotBeverageByName(String name);

    public HotBeverage getHotBeverageByCost(double cost);

    public HotBeverage getHotBeverageByVolume(double volume);


}


