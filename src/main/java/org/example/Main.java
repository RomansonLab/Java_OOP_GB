package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CupOfTea c1 = new CupOfTea("Акбар", 100, 0.5,90);
        CupOfTea c2 = new CupOfTea("Липтон", 110, 0.5,95);
        CupOfTea c3 = new CupOfTea("Береза", 300, 0.3,100);
        CupOfTea c4 = new CupOfTea("Волшебный", 120, 0.2,90);
        CupOfTea c5 = new CupOfTea("Травяной", 120, 0.2,95);
        List<CupOfTea> ListCup = new ArrayList<>();

        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
        vendingMachine.addCupOfTea(c1);
        vendingMachine.addCupOfTea(c2);
        vendingMachine.addCupOfTea(c3);
        vendingMachine.addCupOfTea(c4);
        vendingMachine.addCupOfTea(c5);

        for (CupOfTea c: vendingMachine.getCupOfTeaList()) {
            System.out.println(c);
        }
    }
}