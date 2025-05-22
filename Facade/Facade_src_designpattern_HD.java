package designpattern;

class HD {
    // Método que simula a leitura de dados do disco rígido.
    public byte[] read(long bloco, int tamanho) {
        System.out.println("Lendo dados do disco rígido (Bloco Lógico = " + bloco + ", tamanho = " + tamanho + ").");
        return new byte[tamanho];
    }
}