public class Queijo extends HamburguerDecorator{
    Hamburguer hamburguer;

    public Queijo(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    public String getDescricao(){
        return hamburguer.getDescricao() + ", Queijo extra";
    }

    public double preco() {
        return 2.0 + hamburguer.preco();
    }
}
