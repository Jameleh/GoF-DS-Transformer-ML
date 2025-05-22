package fr.mds.designPattern.observer;

public class HexaObserver implements Observer {

    private String name;

    public HexaObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        System.out.println(this.name + " String : " + Integer.toHexString(state).toUpperCase());
    }
}
