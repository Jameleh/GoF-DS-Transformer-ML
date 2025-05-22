package ProjetoComAbstractFactory.ClassesConcretas;

import ProjetoComAbstractFactory.Interface.Pao;

public class PaoIntegralConcreto implements Pao {

  private static final String INGREDIENTES = "Farinha integral, gergelim, linhaça, água, sal";
  private static final String MODO_PREPARO = "Misturar os ingredientes, sovar a massa, deixar crescer, assar no forno.";
  private static final String SABOR = "Rico em fibras e com sabor marcante.";

  @Override
  public String getIngredientes() {
    return INGREDIENTES;
  }

  @Override
  public String getModoPreparo() {
    return MODO_PREPARO;
  }

  @Override
  public String getSabor() {
    return SABOR;
  }
}
