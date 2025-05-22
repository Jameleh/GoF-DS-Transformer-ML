package com.sn.mane.mediator;


import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteMediator implements Mediator, coordinates between Colleague objects.
 *
 */
public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void notifyColleague(Colleague colleague, String message) {
        colleagues.forEach(itemColleague -> {
            if (itemColleague != colleague){
                itemColleague.receive(message);
            }
        });
    }
}
