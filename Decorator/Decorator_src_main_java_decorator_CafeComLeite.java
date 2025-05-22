package decorator;

public class CafeComLeite extends CafeDecorator  {

    public CafeComLeite(Cafe cafe) {
        super(cafe);
    }
    public String informarTipo() {
        return super.informarTipo() + tipoComLeite();
    }

    private String tipoComLeite() {
        return " Cafe Com Leite";
    }
}
