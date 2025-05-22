public class Context {
    IStrategy strategy;

    public  void strategyApply(){
        strategy.strategyApply();

    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
