package br.com.mferreira.factory;

public class ConcessionariaFactory extends AbstractFactory {
    @Override
    Carro retrieveCarro(String requestedGrade) {
        return null;
    }

    @Override
    Concessionaria retrieveConcessioanria(String requestedGrade) {
        return switch (requestedGrade.toLowerCase()){
            case "honda" -> new Honda("Sao Paulo", "Japão");
            case "toyota" -> new Toyota("Rio de janeiro", "China");
            default -> {
                System.out.println("Concessionária inválida");
                yield null;
            }
        };
    }
}
