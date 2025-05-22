import java.util.HashMap;
import java.util.Map;

public class CarroFactory {
    private static Map<String, Carro> carros= new HashMap<>();

    public static Carro getCarro(String modelo, int ano, String cor){
        Carro carro = carros.get(modelo);
        if(carro == null){
            carro = new Carro(modelo, ano, cor);
            carros.put(modelo, carro);
        }
        return carro;
    }
    public static int getTotalModelosDeCarro(){
        return carros.size();
    }
}
