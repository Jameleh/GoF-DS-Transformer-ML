import java.util.ArrayList;
import java.util.List;

public class Fighter {

    private FighterState state;
    private List<FighterState> memento = new ArrayList<>();

    public FighterState getState() {
        return this.state;
    }

    public void setState(FighterState estado) {
        this.state = estado;
        this.memento.add((this.state));
    }

    public void restoreState (int indice) {
        if(indice < 0 || indice > this.memento.size() - 1){
            throw new IllegalArgumentException("Índice inválido");
        }
        this.state = this.memento.get(indice);
    }

    public List<FighterState> getStates (){
        return this.memento;
    }
}
