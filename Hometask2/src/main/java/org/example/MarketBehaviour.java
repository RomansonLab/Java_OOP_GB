package org.example;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);
    void reeaseFromMarket(List<Actor> actors);
    void update();

}
