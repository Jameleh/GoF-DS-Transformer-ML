package CompositeTest;

import composite.Empresa;
import composite.Programador;
import composite.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class EmpresaTest {

    @Test
    void deveRetornarFuncionarioEmpresa(){
        Programador programador1 = new Programador("Junior","Creitin");
        Programador programador2 = new Programador("Pleno","Daniel");

        Time time12 = new Time("Timao e Pumba");
        time12.adicionarFuncionario(programador1);
        time12.adicionarFuncionario(programador2);

        Programador programador3 = new Programador("Senior","Jequi");
        Programador programador4 = new Programador("Pleno","Chan");

        Time time34 = new Time("Ching e Ling");
        time12.adicionarFuncionario(programador3);
        time12.adicionarFuncionario(programador4);

        Time timeTime = new Time("Time de time");
        timeTime.adicionarFuncionario(time12);
        timeTime.adicionarFuncionario(time34);

        Empresa empresa = new Empresa();
        empresa.setFuncionario(timeTime);

        assertEquals("Time: Time de time\n" +
                "Time: Timao e Pumba\n" +
                "Programador: Creitin - Senioridade: Junior\n" +
                "Programador: Daniel - Senioridade: Pleno\n" +
                "Programador: Jequi - Senioridade: Senior\n" +
                "Programador: Chan - Senioridade: Pleno\n" +
                "Time: Ching e Ling\n",empresa.getFuncionario());
    }

    @Test
    void deveRetornarEmpresaSemFuncionario(){
        try{
            Empresa empresa = new Empresa();
            empresa.getFuncionario();
            fail();
        }
        catch (NullPointerException e ){
            assertEquals("Empresa sem funcionario",e.getMessage());
        }
    }
}
