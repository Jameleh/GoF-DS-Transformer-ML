package mediator.impl;

import colleague.Colleague;
import mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {

    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void listen(Colleague colleague, int amount) {
        colleagues.forEach(col -> {
            if(col != colleague){
                col.receiveBidInfoWhenPlaced(colleague.getName(), amount);
            }
        });
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }


}
