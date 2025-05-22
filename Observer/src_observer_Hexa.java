package observer;

import java.util.Observable;
import java.util.Observer;

public class Hexa implements Observer {
    private String subject;

    public void setSubject(int subject) {
        this.subject = Integer.toHexString(subject);
    }

    public String  getSubject() {
        return subject;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.setSubject(((Subject)o).getState());
        System.out.println("Hexa : "+getSubject());

    }
}
