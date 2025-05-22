package observer;

import java.util.Observable;
import java.util.Observer;

public class Octal implements Observer {
    private String subject;

    public void setSubject(int subject) {
        this.subject = Integer.toOctalString(subject);
    }

    public String  getSubject() {
        return subject;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.setSubject(((Subject)o).getState());
        System.out.println("Octal : "+getSubject());

    }
}
