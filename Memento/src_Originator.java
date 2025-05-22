public class Originator {
    private String stage;

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
    public Memento saveStageToMemento(){
        return new Memento(stage);
    }
    public void getStageFromMemento(Memento memento){
        stage=memento.getStage();
    }
}
