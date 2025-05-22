package strategy;

public class IStrategyImplByDefault implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Default strategy applied");
    }
}
