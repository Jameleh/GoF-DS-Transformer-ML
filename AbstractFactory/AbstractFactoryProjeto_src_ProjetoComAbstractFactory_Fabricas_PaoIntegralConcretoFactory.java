package ProjetoComAbstractFactory.Fabricas;

import ProjetoComAbstractFactory.ClassesConcretas.PaoIntegralConcreto;
import ProjetoComAbstractFactory.Interface.Pao;

public class PaoIntegralConcretoFactory extends PaoFactory {

  @Override
  public Pao criarPaoFrances() {
    throw new UnsupportedOperationException("Operação não suportada por esta fábrica.");
  }

  @Override
  public Pao criarPaoDeMilho() {
    throw new UnsupportedOperationException("Operação não suportada por esta fábrica.");
  }

  @Override
  public Pao criarPaoIntegral() {
    return new PaoIntegralConcreto();
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