import java.util.ArrayList;
import java.util.List;

public class Atleta {

    private AtletaAcao acao;
    private List<AtletaAcao> memento = new ArrayList<>();

    public AtletaAcao getAcao() {
        return this.acao;
    }

    public void setAcao(AtletaAcao acao) {
        this.acao = acao;
        this.memento.add((this.acao));
    }

    public void restauraAcao (int indice) {
        if(indice < 0 || indice > this.memento.size() - 1){
            throw new IllegalArgumentException("Índice inválido");
        }
        this.acao = this.memento.get(indice);
    }

    public List<AtletaAcao> getAcaos (){
        return this.memento;
    }
}