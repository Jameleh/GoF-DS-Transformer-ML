public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();
        originator.setStage("Stage 1");
        originator.setStage("Stage 2");
        careTaker.add(originator.saveStageToMemento());
        originator.setStage("Stage 3");
        careTaker.add(originator.saveStageToMemento());
        originator.setStage("Stage 4");
        System.out.println("current state :"+ originator.getStage());
        originator.getStageFromMemento(careTaker.get(0));
        System.out.println("Firat save state : "+originator.getStage());
        originator.getStageFromMemento(careTaker.get(1));
        System.out.println("Second saved state :"+ originator.getStage());
    }
}
