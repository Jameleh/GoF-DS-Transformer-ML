package fr.mds.designPattern.observer;

class BinaryObserver implements Observer {
    private String name;

    public BinaryObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        System.out.println(this.name + " String : " + Integer.toBinaryString(state).toUpperCase());
    }
}
