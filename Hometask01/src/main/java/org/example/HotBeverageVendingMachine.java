package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine implements IVendingMachine {
    private List<CupOfTea> cupOfTeaList;

    public HotBeverageVendingMachine(List<CupOfTea> cupOfTeaList) {
        this.cupOfTeaList = cupOfTeaList;
    }

    public HotBeverageVendingMachine(){
        this.cupOfTeaList = new ArrayList<>();
    }

    @Override
    public HotBeverage getHotBeverageByName(String name) {
        for (CupOfTea cup: cupOfTeaList) {
            if(cup.getName().equals(name))
                return cup;
            
        }
        return null;
    }

    @Override
    public HotBeverage getHotBeverageByCost(double cost) {
        for (CupOfTea cup: cupOfTeaList) {
            if (cup.getCost() == cost)
                return cup;
            
        }
        return null;
    }

    @Override
    public HotBeverage getHotBeverageByVolume(double volume) {
        for (CupOfTea cup: cupOfTeaList) {
            if (cup.getVolume() == volume)
                return cup;

        }
        return null;
    }

    public List<CupOfTea> getCupOfTeaList() {
        return cupOfTeaList;
    }

    public void setCupOfTeaList(List<CupOfTea> cupOfTeaList) {
        this.cupOfTeaList = cupOfTeaList;
    }
    public void addCupOfTea(CupOfTea cupOfTea) {
        this.cupOfTeaList.add(cupOfTea);
    }

}
