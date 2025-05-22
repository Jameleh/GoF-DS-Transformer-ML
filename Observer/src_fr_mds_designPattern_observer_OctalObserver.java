package fr.mds.designPattern.observer;

public class OctalObserver implements Observer {
    private String name;

    public OctalObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        System.out.println(this.name + " String : " + Integer.toOctalString(state).toUpperCase());
    }
}
