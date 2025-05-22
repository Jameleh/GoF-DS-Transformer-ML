package decorator;

public class Capuccino extends CafeDecorator {

    public Capuccino(Cafe cafe) {
        super(cafe);
    }
    public String informarTipo() {
        return super.informarTipo() + tipoCapuccino();
    }

    private String tipoCapuccino() {
        return " Capuccino";
    }

}
