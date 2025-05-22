package ge.nick.changeOfResponse.utils;

/**
 * Interface that include all required functions to move between states.
 * In implemented classes override functions have described
 * setter of next state and changer of response.
 */

public interface Handler {

    // Set next state to change on it.
    void setNext(Handler next);

    // Change state.
    void handle(Order order);
}
