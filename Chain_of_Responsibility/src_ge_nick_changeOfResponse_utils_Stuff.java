package ge.nick.changeOfResponse.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is prototype of restaurant stuff.
 * Describe all opportunities of stuff.
 * This all opportunities have to same for each stuff.
 * All functions have not required.
 */

public abstract class Stuff extends BaseHandler {

    // List of specific items to work.
    protected List<String> cookiesList;

    // Default constructor that init list.
    public Stuff() {

        cookiesList = new ArrayList<>();
    }

    // To get list of specific items to work.
    public List<String> getCookiesList() {
        return this.cookiesList;
    }

    // To set list of specific items to work.
    public void setCookiesList(List<String> cookiesList) {
        this.cookiesList = cookiesList;
    }

    @Override
    public void handle(Order order) {
        super.handle(order);
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "cookiesList=" + cookiesList +
                '}';
    }
}
