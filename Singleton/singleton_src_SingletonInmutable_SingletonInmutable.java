/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingletonInmutable;

/**
 *
 * @author salas
 */
public class SingletonInmutable {

    private static final SingletonInmutable instancia = new SingletonInmutable();

    private SingletonInmutable() {
        // Código de inicialización si es necesario
        System.out.println("Inicializando SingletonInmutable.");
    }

    public static SingletonInmutable getInstance() {
        return instancia;
    }

    public final String obtenerDatosComplejos() {
        // Simulación de acceso a datos complejos
        System.out.println("Recuperando datos complejos.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Datos complejos recuperados";
    }

    public final void realizarOperacionLenta(String parametro) {
        System.out.println("Realizando operación lenta con parámetro: " + parametro);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Operación lenta completada.");
    }
}
