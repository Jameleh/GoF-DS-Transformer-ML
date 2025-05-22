package ProjetoComAbstractFactory.Fabricas;

import ProjetoComAbstractFactory.ClassesConcretas.PaoDeMilhoConcreto;
import ProjetoComAbstractFactory.Interface.Pao;

public class PaoDeMilhoConcretoFactory extends PaoFactory {

  @Override
  public Pao criarPaoFrances() {
    throw new UnsupportedOperationException("Operação não suportada por esta fábrica.");
  }

  @Override
  public Pao criarPaoDeMilho() {
    return new PaoDeMilhoConcreto();
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