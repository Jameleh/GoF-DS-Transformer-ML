package fran.francommand;

public abstract class Operacion implements Comando {
    
    protected double operando1;
    protected double operando2;


    public Operacion(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

}
