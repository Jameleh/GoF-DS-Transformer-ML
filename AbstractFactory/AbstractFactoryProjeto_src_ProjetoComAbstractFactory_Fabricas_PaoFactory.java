package ProjetoComAbstractFactory.Fabricas;

import ProjetoComAbstractFactory.ClassesConcretas.PaoDeMilhoConcreto;
import ProjetoComAbstractFactory.ClassesConcretas.PaoFrancesConcreto;
import ProjetoComAbstractFactory.ClassesConcretas.PaoIntegralConcreto;
import ProjetoComAbstractFactory.Interface.Pao;

public abstract class PaoFactory implements Pao {
  
  public Pao criarPaoFrances(){
    return new PaoFrancesConcreto();
  }

  public Pao criarPaoDeMilho(){
    return new PaoDeMilhoConcreto();
  }

  public Pao criarPaoIntegral(){
    return new PaoIntegralConcreto();
  }
}
