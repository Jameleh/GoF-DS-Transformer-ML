package drugstore;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DrugstoreTest {

    @Test
    void deveRetornarProdutos(){
        Drugstore drugstore = new Drugstore();
        drugstore.addProduct("Aspirin", "Bayer", "Germany");
        drugstore.addProduct("Secnidazol", "Medley", "USA");
        drugstore.addProduct("Insulin", "X", "China");

       List<String> saida = Arrays.asList(
               "Product: Aspirin Manufacturer: Bayer Country: Germany",
                "Product: Secnidazol Manufacturer: Medley Country: USA",
                "Product: Insulin Manufacturer: X Country: China");

        assertEquals(saida, drugstore.getProductStrings());
    }

    @Test
    void deveRetornarTotalFabricantes(){
        Drugstore drugstore = new Drugstore();
        drugstore.addProduct("Aspirin", "Bayer", "Germany");
        drugstore.addProduct("Secnidazol", "Medley", "USA");
        drugstore.addProduct("Insulin", "X", "China");
        drugstore.addProduct("Insulin", "X", "China");

        assertEquals(3, ManufacturerFactory.getManufacturers().size());
    }

}