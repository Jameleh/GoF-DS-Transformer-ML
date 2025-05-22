package com.sn.mane.mediator;

/**
 * ConcreteColleague1 implements Colleague interface.
 *
 */
public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void notifyColleague(String message) {
        this.mediator.notifyColleague(this, message);
    }

    @Override
    void receive(String message) {
        this.setReceivedMessage(message);
    }
}
