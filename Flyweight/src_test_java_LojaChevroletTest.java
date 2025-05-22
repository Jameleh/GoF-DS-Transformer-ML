import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LojaChevroletTest {

    @Test
    void deveRetornarAlunos() {
        LojaChevrolet loja = new LojaChevrolet();
        loja.cadastro("Fulanito", "Silva", 3243131, "Prisma LTZ", 2021, "Branco");
        loja.cadastro("Xeroxvaldo", "Costa", 2311312, "Onix", 2014, "Rosa");
        loja.cadastro("Mac", "Oliveira", 4525233, "Prisma LTZ", 2025, "Azul Oceano");
        loja.cadastro("Linux", "Santos", 4213222, "S10", 2019, "Branco");

        List<String> saida = Arrays.asList(
                "Cliente{Nome: 'Fulanito', Sobrenome: 'Silva', CPF: '3243131', modelo: 'Prisma LTZ', ano: '2021', cor: 'Branco'}",
                "Cliente{Nome: 'Xeroxvaldo', Sobrenome: 'Costa', CPF: '2311312', modelo: 'Onix', ano: '2014', cor: 'Rosa'}",
                "Cliente{Nome: 'Mac', Sobrenome: 'Oliveira', CPF: '4525233', modelo: 'Prisma LTZ', ano: '2025', cor: 'Azul Oceano'}",
                "Cliente{Nome: 'Linux', Sobrenome: 'Santos', CPF: '4213222', modelo: 'S10', ano: '2019', cor: 'Branco'}");

        assertEquals(saida, loja.obterClientes());
    }

    @Test
    void deveRetornarTotalModelosDeCarro() {
        LojaChevrolet loja = new LojaChevrolet();
        loja.cadastro("Fulanito", "Silva", 3243131, "Prisma LTZ", 2021, "Branco");
        loja.cadastro("Xeroxvaldo", "Costa", 2311312, "Onix", 2014, "Rosa");
        loja.cadastro("Mac", "Oliveira", 4525233, "Prisma LTZ", 2025, "Azul Oceano");
        loja.cadastro("Linux", "Santos", 4213222, "S10", 2019, "Branco");

        assertEquals(2, CarroFactory.getTotalModelosDeCarro());
    }

}