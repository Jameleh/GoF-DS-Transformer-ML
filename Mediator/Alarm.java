/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Alarm implements Colleague{
    String name;
    Mediator mediator;

    public Alarm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doAlarm() {
        mediator.doAlarm();
    }
    public void endAlarm(String from) {
        mediator.endAlarm(from);
    }
}