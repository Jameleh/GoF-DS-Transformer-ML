package designpattern;

// Classe que representa a CPU do computador
class CPU {
    // Método que simula o congelamento da CPU.
    public void freeze() {
        System.out.println("Congelando a CPU.");
    }

    // Método que simula a alteração do ponto de execução da CPU.
    public void jump(long posicao) {
        System.out.println("Pulando para a posição: " + posicao);
    }

    // Método que simula a execução da CPU.
    public void execute() {
        System.out.println("Executando a CPU.");
    }
}

