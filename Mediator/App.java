/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class App {
    public static void main(String[] args) {
        Alarm alarm = new Alarm("Alarm");
        Sprinkler sprinkler = new Sprinkler("Sprinkler");
        CoffeePot coffeePot = new CoffeePot("Coffee Pot");
        TimeMediator mediator = new TimeMediator();
        mediator.setAlarm(alarm);
        mediator.setSprinkler(sprinkler);
        mediator.setCoffeePot(coffeePot);

        alarm.setMediator(mediator);
        sprinkler.setMediator(mediator);
        coffeePot.setMediator(mediator);
        alarm.doAlarm();
        sprinkler.doSprinkler();
        coffeePot.doCoffeePot();
    }    
}
//Alarm is sending event to all...
//I am sprinkler,... doing my task
//Alarm event ended from Sprinkler
//I am coffe pot,... doing my task
//Alarm event ended from Coffee Pot
