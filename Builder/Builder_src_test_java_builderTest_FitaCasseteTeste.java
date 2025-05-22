package builderTest;

import builder.FitaCassete;
import builder.FitaCasseteBuilder;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FitaCasseteTeste {

    private Date dataValida ;
    private Date dataInvalida;

    public FitaCasseteTeste() {
        try {
            dataInvalida = new SimpleDateFormat("yyyy-MM-dd").parse("2077-11-11");
            dataValida = new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-11");
        } catch (ParseException e){}
    }

    @Test
    public void deveRetornarIdInvalido() {
        try {
            FitaCasseteBuilder fitaCasseteBuilder = new FitaCasseteBuilder();
            FitaCassete fitaCassete = fitaCasseteBuilder
                    .setId(-99)
                    .setNomeFita("A melhor fita do mundo")
                    .setDataLocacao(dataValida)
                    .setPrateleira("Teste")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Id de Fita inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeFitaInvalido() {
        try {
            FitaCasseteBuilder fitaCasseteBuilder = new FitaCasseteBuilder();
            FitaCassete fitaCassete = fitaCasseteBuilder
                    .setId(1)
                    .setNomeFita("")
                    .setDataLocacao(dataValida)
                    .setPrateleira("Teste")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome de Fita inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarPrateleiraDaFitaInvalida() {
        try {
            FitaCasseteBuilder fitaCasseteBuilder = new FitaCasseteBuilder();
            FitaCassete fitaCassete = fitaCasseteBuilder
                    .setId(2)
                    .setNomeFita("A melhor fita do mundo")
                    .setDataLocacao(dataValida)
                    .setPrateleira("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Prateleira da Fita inválida", e.getMessage());
        }
    }

    @Test
    public void deveRetornarDataLocacaoInvalida() {
        try {
            FitaCasseteBuilder fitaCasseteBuilder = new FitaCasseteBuilder();
            FitaCassete fitaCassete = fitaCasseteBuilder
                    .setId(3)
                    .setNomeFita("Teste")
                    .setDataLocacao(dataInvalida)
                    .setPrateleira("Teste")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de Locacao da Fita inválida", e.getMessage());
        }
    }
}
