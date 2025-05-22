package ExDesignPatternFacade;

public class Combo {

    PratoPrincipal pp = new PratoPrincipal();
    Bebida b = new Bebida();
    Sobremesa s = new Sobremesa();

    public void escolherPratoPrincipal() {
        pp.list();
        pp.escolherPrato(1);
    }

    public void escolherBebida() {
        b.list();
        b.escolherBebida(1);
    }

    public void escolherSobremesa() {
       s.list();
       s.escolherSobremesa(1);
    }

    public void comboCriado() {

    }

    public void listaCombo() {

    }
}
