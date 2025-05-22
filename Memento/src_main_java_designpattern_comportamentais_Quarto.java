package designpattern.comportamentais;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numberRoom;
    private QuartoEstado stateRoom;
    private List<QuartoEstado> memento = new ArrayList<QuartoEstado>();

    public QuartoEstado getStateRoom()
    {
        return this.stateRoom;
    }

    public void setQuartoState(QuartoEstado stateRoom)
    {
        this.stateRoom = stateRoom;
        this.memento.add(this.stateRoom);
    }

    public void toRestoreState(int indice)
    {
        if(indice < 0 || indice > this.memento.size() -1)
        {
            throw new IllegalArgumentException("Indice inválido");
        }
        this.stateRoom = this.memento.get(indice);
    }

    public List<QuartoEstado> getStatesRoom(){
        return this.memento;
    }


}
