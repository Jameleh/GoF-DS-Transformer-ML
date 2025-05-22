package context;

import strategy.StrategyTrie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, StrategyTrie> strategyTrieMap = new HashMap<>();
        while (true) {
            try {
                System.out.println(" Quelle Strategie : ");
                String startegyClass = scanner.nextLine();
                StrategyTrie strategyTrie = strategyTrieMap.get(startegyClass);
                if (strategyTrie == null) {
                    strategyTrie = (StrategyTrie) Class.forName(startegyClass).getConstructor().newInstance();
                    strategyTrieMap.put(startegyClass, strategyTrie);
                }
                context.setStrategyTri(strategyTrie); // Set the strategy in the context
                context.effectuerTrie();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
