package brigde;

public class Esferografica extends Caneta{
    public Esferografica(Cor cor){
        super(cor);
    }

    @Override
    public String getCaneta() {
        return "Caneta esferografica de cor " + this.cor.getCor();
    }
}
