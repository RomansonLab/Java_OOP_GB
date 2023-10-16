package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Volodya");
        Human human2 = new Human("SirGey");
        market.acceptToMarket(human1);
        market.update();
        market.acceptToMarket(human2);
        market.update();

    }
}