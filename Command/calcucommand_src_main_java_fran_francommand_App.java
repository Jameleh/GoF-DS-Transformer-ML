package fran.francommand;

import java.util.Scanner;

public final class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener operandos
        System.out.print("Ingrese el primer operando: ");
        double operando1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo operando: ");
        double operando2 = scanner.nextDouble();

        // Mostrar opciones al usuario
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        // Obtener la opción seleccionada por el usuario
        System.out.print("Ingrese el número de operación: ");
        int opcion = scanner.nextInt();

        // Crear el objeto de la operación correspondiente según la opción seleccionada
        Operacion operacion;
        switch (opcion) {
            case 1:
                operacion = new Suma(operando1, operando2);
                break;
            case 2:
                operacion = new Resta(operando1, operando2);
                break;
            case 3:
                operacion = new Multiplicacion(operando1, operando2);
                break;
            case 4:
                operacion = new Division(operando1, operando2);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        // Crear el invocador y ejecutar la operación
        CalculadoraInvoker invoker = new CalculadoraInvoker();
        invoker.setComando(operacion);
        invoker.ejecutarComando();

        scanner.close();
    }
}
