/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class CoffeePot implements Colleague {
    String name;
    Mediator mediator;

    public CoffeePot(String name) {
        this.name = name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void doCoffeePot() {
        mediator.doCoffeePot();
        mediator.endAlarm(getName());
    }
}
