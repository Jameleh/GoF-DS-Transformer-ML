package ge.nick.changeOfResponse.utils;

/**
 * Class Base to move between state and set function to change response.
 * Implements interface with required functions to complete task.
 * By this way developer must set each state at initialize by hand.
 * For this it needs classes (states) to change.
 */

public abstract class BaseHandler implements Handler {

    // State that must be changed on it.
    protected Handler next;

    @Override
    public void setNext(Handler next) { this.next = next; }

    @Override
    public void handle(Order order) {

        // Check if next state has set to change it.
        if(this.next == null){

            throw new IllegalStateException("Error at request handling: " + order);
        }

        // Change response.
        next.handle(order);
    }
}
