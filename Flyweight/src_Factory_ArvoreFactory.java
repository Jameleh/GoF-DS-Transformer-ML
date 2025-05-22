package Factory;

import model.Arvore;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static final Map<String, Arvore> arvoresCache = new HashMap<>();

    public static Arvore getArvore(String tipo, String cor) {
        String chaveCache = tipo + "-" + cor;
        Arvore arvore = arvoresCache.get(chaveCache);

        if (arvore == null) {
            switch (tipo) {
                case "Ornamentais":
                    arvore = new Arvore(200, 400, cor, tipo);
                    break;
                case "Frutíferas":
                    arvore = new Arvore(500, 300, cor, tipo);
                    break;
                case "Florífera":
                    arvore = new Arvore(100, 200, cor, tipo);
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de árvore inválido: " + tipo);
            }

            arvoresCache.put(chaveCache, arvore);
        }

        return arvore;
    }
}
