import strategy.IStrategy;
import strategy.IStrategyImpl1;
import strategy.IStrategyImpl2;
import strategy.IStrategyImplByDefault;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        Context context = new Context();
        boolean finish = false;
        Scanner scanner = new Scanner(System.in);

        HashMap<String, IStrategy> strategies = new HashMap<>();
        IStrategy strategy = null;
            while (!finish) {
                System.out.println("Enter the Startegy you want to apply: ");
                String strategyClassName = scanner.nextLine();

                strategy = strategies.get(strategyClassName);
                if (strategy == null) {
                    try {
                        strategy = (IStrategy) Class.forName(strategyClassName).getDeclaredConstructor().newInstance();
                        strategies.put(strategyClassName, strategy);
                        System.out.println("Creating new strategy: " + strategyClassName);
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                             NoSuchMethodException | InvocationTargetException e) {
                        System.out.println("Strategy not found, applying default strategy.");
                        strategy = strategies.computeIfAbsent("default", k -> new IStrategyImplByDefault());
                    }
                }
                context.setStrategy(strategy);
                context.process();
                System.out.println("________________________________________________________");
                System.out.println("Do you want to continue? (Y/N)");
                String continueChoice = scanner.nextLine();
                if (continueChoice.equalsIgnoreCase("N")) {
                    finish = true;
                }
            }

    }
}