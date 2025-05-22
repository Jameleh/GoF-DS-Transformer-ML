package fran.francommand;

public class Resta extends Operacion {
    
    public Resta(double operando1, double operando2) {
        super(operando1, operando2);
    }

    public void ejecutar() {
        double resultado = operando1 - operando2;
        System.out.println("El resultado de la resta es: " + resultado);
    }
}
