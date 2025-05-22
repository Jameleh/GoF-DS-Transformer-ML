package flyweight;

import java.util.HashMap;
import java.util.Map;
public class CaracteristicasFactory {
    private static Map<String, Caracteristicas> caracteristicasMap = new HashMap<>();

    public static Caracteristicas getCaracteristicas(String layout, String codBarras, String keycaps, String switches) {
        Caracteristicas caracteristicas = caracteristicasMap.get(layout);
        if (caracteristicas == null) {
            caracteristicas = new Caracteristicas(layout, codBarras, keycaps, switches);
            caracteristicasMap.put(codBarras, caracteristicas);
        }
        return caracteristicas;
    }

    public static int getTotalCaracteristicas() {
        return caracteristicasMap.size();
    }
}
