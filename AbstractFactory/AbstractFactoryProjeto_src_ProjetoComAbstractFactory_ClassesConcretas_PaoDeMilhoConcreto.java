package ProjetoComAbstractFactory.ClassesConcretas;

import ProjetoComAbstractFactory.Interface.Pao;

public class PaoDeMilhoConcreto implements Pao {

  private static final String INGREDIENTES = "Farinha de milho, leite, ovos, óleo, açúcar";
  private static final String MODO_PREPARO = "Misturar os ingredientes, bater a massa, assar no forno.";
  private static final String SABOR = "Doce e macio.";

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