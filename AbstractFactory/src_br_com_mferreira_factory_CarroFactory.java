package br.com.mferreira.factory;

public class CarroFactory extends AbstractFactory {
    @Override
    Carro retrieveCarro(String requestedGrade) {
        return switch (requestedGrade) {
            case "civic" -> new Civic("Cinza", 800, true);
            case "corola" -> new Corola("Preto", 900, true);
            default -> {
                System.out.println("A requisição não pode ser atendida, infelizmente não disponível");
                yield null;
            }
        };
    }

    @Override
    Concessionaria retrieveConcessioanria(String requestedGrade) {
        return null;
    }

    ;
}
