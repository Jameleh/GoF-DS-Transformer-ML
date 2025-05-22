package mediator;

import colleague.Colleague;

public interface Mediator {
    void listen(Colleague colleague, int amount);
    void addColleague(Colleague colleague);
}
