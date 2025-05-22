package prototype;

public class Quarto implements Cloneable{
    private int numeroQuarto;
    private int andar;
    private float precoDiaria;
    private float outrosGastos;
    private Hospede hospede;

    public Quarto(int numeroQuarto, int andar, float precoDiaria, float outrosGastos, Hospede hospede) {
        this.numeroQuarto = numeroQuarto;
        this.andar = andar;
        this.precoDiaria = precoDiaria;
        this.outrosGastos = outrosGastos;
        this.hospede = hospede;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(float precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public float getOutrosGastos() {
        return outrosGastos;
    }

    public void setOutrosGastos(float outrosGastos) {
        this.outrosGastos = outrosGastos;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    @Override
    public Quarto clone() throws CloneNotSupportedException{
        Quarto quartoClone = (Quarto) super.clone();
        quartoClone.hospede = (Hospede) quartoClone.hospede.clone();
        return quartoClone;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numeroQuarto=" + numeroQuarto +
                ", andar=" + andar +
                ", precoDiaria=" + precoDiaria +
                ", outrosGastos=" + outrosGastos +
                ", hospede=" + hospede +
                '}';
    }
}
