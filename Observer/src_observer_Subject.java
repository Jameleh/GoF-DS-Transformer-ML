package observer;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class Subject extends Observable {
    Timer timer = new Timer();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        System.out.println("Decimal :"+ getState());
        setChanged();
        notifyObservers();

    }

    public void run() {
        TimerTask Increment = new TimerTask() {
            @Override
            public void run() {
                setState((getState() + 1) % 60);
            }
        };
        timer.schedule(Increment
        , 0,2000);
    }

}
