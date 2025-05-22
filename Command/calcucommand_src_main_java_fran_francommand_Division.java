package fran.francommand;

public class Division extends Operacion{
    
    public Division(double operando1, double operando2) {
        super(operando1, operando2);
    }

    public void ejecutar() {
        if (operando2 != 0) {
            double resultado = operando1 / operando2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }

}
