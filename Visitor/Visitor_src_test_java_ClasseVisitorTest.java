import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClasseVisitorTest {

    @Test
    void deveExibirArqueiro() {
        Arqueiro arqueiro = new Arqueiro(40, "Legolas", 20);

        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Aluno{nível=40, nome='Legolas', número de flechas=20}", visitor.exibir(arqueiro));
    }

    @Test
    void deveExibirGuerreiro() {
        Guerreiro professor = new Guerreiro(30, "Aragorn", "zweihander");

        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Professor{nível=30, nome='Aragorn', arma='zweihander'}", visitor.exibir(professor));
    }

    @Test
    void deveExibirMago() {
        Mago mago = new Mago(50, "Gandalf", "Exevo Gran Mas Flam");

        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Funcionario{nível=50, nome='Gandalf', magia='Exevo Gran Mas Flam'}", visitor.exibir(mago));
    }

}