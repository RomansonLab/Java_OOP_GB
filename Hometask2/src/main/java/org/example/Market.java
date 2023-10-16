package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehavior {
    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void reeaseFromMarket(List<Actor> actors) {
         for(Actor actor : actors){
             queue.remove(actor);
             System.out.println(actor.getName() + " вышел из магазина");
         }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        Iterator<Actor> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Actor actor = iterator.next();
            if (actor.isTakeOrder()) {
                System.out.println(actor.getName() + " вышел из очереди");
                iterator.remove();
                System.out.println(actor.getName() + " вышел из магазина");
            }
        }
    }
}
