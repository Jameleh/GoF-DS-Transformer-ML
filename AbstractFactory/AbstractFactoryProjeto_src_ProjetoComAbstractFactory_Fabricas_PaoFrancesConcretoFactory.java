package ProjetoComAbstractFactory.Fabricas;

import ProjetoComAbstractFactory.ClassesConcretas.PaoFrancesConcreto;
import ProjetoComAbstractFactory.Interface.Pao;

public class PaoFrancesConcretoFactory extends PaoFactory {
    @Override
    public Pao criarPaoFrances() {
        return new PaoFrancesConcreto();
    }

    @Override
    public Pao criarPaoDeMilho() {
        throw new UnsupportedOperationException("Operação não suportada por esta fábrica.");
    }

    @Override
    public Pao criarPaoIntegral() {
        throw new UnsupportedOperationException("Operação não suportada por esta fábrica.");
    }

    @Override
    public String getIngredientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIngredientes'");
    }

    @Override
    public String getModoPreparo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModoPreparo'");
    }

    @Override
    public String getSabor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSabor'");
    }
}