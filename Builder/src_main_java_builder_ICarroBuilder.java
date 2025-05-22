package builder;
import model.Carro;

import java.util.List;

public interface ICarroBuilder {

    ICarroBuilder modelo(String modelo);
    ICarroBuilder cor(String cor);
    ICarroBuilder motor(String motor);
    ICarroBuilder adicionarAcessorios(String acesseorio);
    ICarroBuilder combustivel(String combustivel);
    ICarroBuilder portas(Integer portas);
    ICarroBuilder ano(Integer ano);
    ICarroBuilder sistemaDeNavegacao(boolean sistemaDeNavegacao);

    Carro build();
}
