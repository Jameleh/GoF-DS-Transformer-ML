import strategy.IStrategy;
import strategy.IStrategyImplByDefault;

public class Context {

    IStrategy strategy;

    public Context() {
        this.strategy = new IStrategyImplByDefault();
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(){
        System.out.println("Processing...");
        this.strategy.applyStrategy();
        System.out.println("Process completed");
    }
}