import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private PessoaEstado estado;
    private List<PessoaEstado> memento = new ArrayList<PessoaEstado>();

    public PessoaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(PessoaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restaurarEstado(int indice){
        if(indice < 0 || indice > this.memento.size() -1){
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }
    public List<PessoaEstado> getEstados(){
        return this.memento;
    }
}
