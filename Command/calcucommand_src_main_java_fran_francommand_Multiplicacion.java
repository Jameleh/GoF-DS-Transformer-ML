package fran.francommand;

public class Multiplicacion extends Operacion {
    
    public Multiplicacion(double operando1, double operando2) {
        super(operando1, operando2);
    }

    public void ejecutar() {
        double resultado = operando1 * operando2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

}
