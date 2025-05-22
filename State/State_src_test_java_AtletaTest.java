import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {
    Atleta atleta;

    @BeforeEach
    public void setUp(){
        atleta = new Atleta();
    }


    @Test
    public void atletaForaDoDescansoAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Atleta não pode iniciar Descanso", atleta.descansando());
    }
    @Test
    public void atletaIniciouRefeicaoAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Refeicao iniciada", atleta.comendo());
    }
    @Test
    public void atletaIniciouTreinoDeMusculacaoAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de natação iniciado", atleta.treinandoMusculacao());
    }
    @Test
    public void atletaIniciouTreinoDeCardioAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de corrida iniciado", atleta.fazendoCardio());
    }

    @Test
    public void atletaNoDescansoAtletaComendo(){
        atleta.setEstado(AtletaEstadoComendo.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaNaoIniciouRefeicaoAtletaComendo(){
        atleta.setEstado(AtletaEstadoComendo.getInstance());
        assertEquals("Refeicao não iniciada", atleta.comendo());
    }
    @Test
    public void atletaNaoIniciouTreinoDeMusculacaoAtletaComendo(){
        atleta.setEstado(AtletaEstadoComendo.getInstance());
        assertEquals("Treino não iniciado", atleta.treinandoMusculacao());
    }

    @Test
    public void atletaIniciouTreinoDeCardioAtletaComendo(){
        atleta.setEstado(AtletaEstadoComendo.getInstance());
        assertEquals("Treino de corrida iniciado", atleta.fazendoCardio());
    }

    @Test
    public void atletaNoDescansoAtletaFazendoCardio(){
        atleta.setEstado(AtletaEstadoFazendoCardio.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaIniciouRefeicaoAtletaFazendoCardio(){
        atleta.setEstado(AtletaEstadoFazendoCardio.getInstance());
        assertEquals("Refeicao iniciada", atleta.comendo());
    }
    @Test
    public void atletaNaoIniciouTreinoDeMusculacaoAtletaFazendoCardio(){
        atleta.setEstado(AtletaEstadoFazendoCardio.getInstance());
        assertEquals("Treino não iniciado", atleta.treinandoMusculacao());
    }
    @Test
    public void atletaNãoIniciouTreinoDeCardioAtletaFazendoCardio(){
        atleta.setEstado(AtletaEstadoFazendoCardio.getInstance());
        assertEquals("Treino não iniciado", atleta.fazendoCardio());
    }

    @Test
    public void atletaNoDescansoAtletaTreinandoMusculacao(){
        atleta.setEstado(AtletaEstadoTreinandoMusculacao.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaIniciouRefeicaoAtletaTreinandoMusculacao(){
        atleta.setEstado(AtletaEstadoTreinandoMusculacao.getInstance());
        assertEquals("Refeicao não iniciada", atleta.comendo());
    }
    @Test
    public void atletaNaoIniciouTreinoDeMusculacaoAtletaTreinandoMusculacao(){
        atleta.setEstado(AtletaEstadoTreinandoMusculacao.getInstance());
        assertEquals("Treino não iniciado", atleta.treinandoMusculacao());
    }
    @Test
    public void atletaNãoIniciouTreinoDeCardioAtletaTreinandoMusculacao(){
        atleta.setEstado(AtletaEstadoTreinandoMusculacao.getInstance());
        assertEquals("Treino não iniciado", atleta.fazendoCardio());
    }

}