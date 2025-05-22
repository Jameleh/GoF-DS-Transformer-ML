package observer;

import java.util.Observable;
import java.util.Observer;

public class Binary implements Observer {
    private int subject;

    public void setSubject(int subject) {
        this.subject = Integer.parseInt(Integer.toBinaryString(subject));
    }

    public int getSubject() {
        return subject;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.setSubject(((Subject)o).getState());
        System.out.println("Binary : "+getSubject());

    }
}
