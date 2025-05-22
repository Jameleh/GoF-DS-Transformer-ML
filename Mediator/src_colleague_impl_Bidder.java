package colleague.impl;

import colleague.Colleague;
import mediator.Mediator;

public class Bidder implements Colleague {

    private final Mediator mediator;

    private final String name;

    public Bidder(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addColleague(this);
    }

    @Override
    public void placeBid(int amount) {
        mediator.listen(this, amount);
    }

    @Override
    public void receiveBidInfoWhenPlaced(String name, int amount) {
        System.out.println("Hey "+this.name+", Bid is placed by "+name+" for a whooping amount of "+amount);
    }

    @Override
    public String getName() {
        return this.name;
    }

}
