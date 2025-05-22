package colleague;

import mediator.Mediator;

public interface Colleague {
    void placeBid(int amount);
    void receiveBidInfoWhenPlaced(String name, int amount);
    String getName();
}
