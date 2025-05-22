package designpattern;

public class ExemploFacade {
    public static void main(String[] args) {
        // Cria uma instância da Facade, que esconde a complexidade dos subsistemas.
        Facade computer = new Facade();
        // Inicializa o computador utilizando a interface simplificada.
        computer.start();
    }
}