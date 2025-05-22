package fran.francommand;

public class Suma extends Operacion{
    
    public Suma(double operando1, double operando2) {
        super(operando1, operando2);
    }

    public void ejecutar() {
        double resultado = operando1 + operando2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

}
