/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class TimeMediator implements Mediator {
    Alarm alarm;
    CoffeePot coffeePot;
    Sprinkler sprinkler;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    public void setSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void doAlarm() {
        System.out.println(alarm.getName() + " is sending event to all...");
    }

    @Override
    public void endAlarm(String from) {
        System.out.println(alarm.getName() + " event ended from " + from);
    }

    @Override
    public void doCoffeePot() {
        System.out.println("I am coffee pot,... doing my task");
    }

    @Override
    public void doSprinkler() {
        System.out.println("I am sprinkler,... doing my task");
    }
}
