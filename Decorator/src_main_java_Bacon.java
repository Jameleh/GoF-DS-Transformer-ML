public class Bacon extends HamburguerDecorator{
    Hamburguer hamburguer;

    public Bacon(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    public String getDescricao(){
        return hamburguer.getDescricao() + ", Bacon extra";
    }

    public double preco() {
        return 2.50 + hamburguer.preco();
    }
}
