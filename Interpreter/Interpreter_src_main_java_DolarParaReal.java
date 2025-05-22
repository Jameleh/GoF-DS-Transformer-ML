public class DolarParaReal {
    private double valor;
    private double taxa;

    public double getvalor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double calcularNota() {
        return Cambio.calcularDinheiro(this.valor, this.taxa * this.valor);
    }
}
