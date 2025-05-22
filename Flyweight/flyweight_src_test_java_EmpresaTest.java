import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();
        empresa.cadastrar("Jonas", "Junior", "Dev", 2000.0);
        empresa.cadastrar("Eduarda", "Junior", "Dev", 2000.0);
        empresa.cadastrar("Gabriel", "Pleno", "QA", 4000.0);
        empresa.cadastrar("Carlos", "Senior", "Eng Software", 8000.0);

        List<String> saida = Arrays.asList(
                "Aluno{nome='Jonas', cargo='Junior', funcao='Dev', salario='2000.0'}",
                "Aluno{nome='Eduarda', cargo='Junior', funcao='Dev', salario='2000'}",
                "Aluno{nome='Gabriel', cargo='Pleno', funcao='QA', salario='4000'}",
                "Aluno{nome='Carlos', cargo='Senior', funcao='Eng Software', salario='8000'}");

        assertEquals(saida, escola.obterAlunos());
    }

    @Test
    void deveRetornarTotalCargos() {
        Empresa empresa = new Empresa();
        empresa.cadastrar("Jonas", "Junior", "Dev", 2000.0);
        empresa.cadastrar("Eduarda", "Junior", "Dev", 2000.0);
        empresa.cadastrar("Gabriel", "Pleno", "QA", 4000.0);
        empresa.cadastrar("Carlos", "Senior", "Eng Software", 8000.0);

        assertEquals(2, CargoFactory.getTotalCargos());
    }

}