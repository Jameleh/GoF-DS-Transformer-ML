package decorator;

public abstract class CafeDecorator implements Cafe{
    private Cafe cafe;

    public CafeDecorator(Cafe cafe){
        this.cafe = cafe;
    }

    @Override
    public String informarTipo(){
        return cafe.informarTipo();
    }
}
