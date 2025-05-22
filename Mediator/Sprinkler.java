/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Sprinkler implements Colleague {
    String name;
    Mediator mediator;

    public Sprinkler(String name) {
        this.name = name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }
    public void doSprinkler() {
        mediator.doSprinkler();
        mediator.endAlarm(getName());
    }
}
