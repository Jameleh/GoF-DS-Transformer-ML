package flyweight.example.trees;

import java.awt.*; // Lib GUI
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>(); // Cache para tipos de árvore
    
    // Retorna um TreeType existente ou cria um novo, se não existir
    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name); // Busca o tipo pelo nome no cache
        if (result == null) {
            result = new TreeType(name, color, otherTreeData); // Cria novo tipo e add no cache
            treeTypes.put(name, result);
        }
        return result;
    }
}