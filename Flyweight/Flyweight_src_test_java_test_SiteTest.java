package test;

import flyweight.CaracteristicasFactory;
import flyweight.Site;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SiteTest {
    @Test
    void deveRetornarTeclados() {
        Site site = new Site();
        site.adicionar("Teclado1","Pt-Br","as8d965a9","Splinning","Splanning");
        site.adicionar("Teclado2","Ingles","as8d965a8","Tiurus","Bango");
        site.adicionar("Teclado3","Ingles","as8d965a7","Tiurus","Bago");
        site.adicionar("Teclado4","Ingles","as8d965a6","Perdido","Aqui");

        List<String> saida = Arrays.asList(
                "Teclado{nome='Teclado1', layout='Pt-Br', keycaps='Splinning', switches='Splanning'}",
                "Teclado{nome='Teclado2', layout='Ingles', keycaps='Tiurus', switches='Bango'}",
                "Teclado{nome='Teclado3', layout='Ingles', keycaps='Tiurus', switches='Bago'}",
                "Teclado{nome='Teclado4', layout='Ingles', keycaps='Perdido', switches='Aqui'}");

        assertEquals(saida, site.obterTodosTeclados());
    }

    @Test
    void deveRetornarTotalCaracteristicas(){
        Site site = new Site();
        site.adicionar("Teclado1","Pt-Br","as8d965a9","Splinning","Splanning");
        site.adicionar("Teclado2","Ingles","as8d965a8","Tiurus","Bango");
        site.adicionar("Teclado3","Ingles","as8d965a7","Tiurus","Bago");
        site.adicionar("Teclado4","Ingles","as8d965a6","Perdido","Aqui");
        assertEquals(4, CaracteristicasFactory.getTotalCaracteristicas());
    }
}
