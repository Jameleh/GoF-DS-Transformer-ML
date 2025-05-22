import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClasseVisitorTest {

    @Test
    void deveExibirLutador() {
        Fighter fighter = new Fighter("Anderson Silva", "34-11 (1)");

        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Lutador{nome='Anderson Silva', cartel=34-11 (1)}", visitor.exibir(fighter));
    }

    @Test
    void deveExibirTreinador() {
        Coach coach = new Coach("André Perdeneiras", "Nova União");

        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Treinador{nome='André Perdeneiras', equipe='Nova União'}", visitor.exibir(coach));
    }

    @Test
    void deveExibirArbitro() {
        Referee arbitro = new Referee("Herb Dean", 52);

        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Arbitro{nome='Herb Dean', lutas arbitradas='52'}", visitor.exibir(arbitro));
    }


}