package brigde;

public class QuadroBranco extends Caneta{
    public QuadroBranco(Cor cor){
        super(cor);
    }

    @Override
    public String getCaneta() {
        return "Caneta de quadro branco de cor " + this.cor.getCor();
    }
}
