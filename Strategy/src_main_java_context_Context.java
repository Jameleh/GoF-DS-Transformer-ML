package context;

import strategy.StrategyTrie;

public class Context {
    private StrategyTrie strategyTri;
    public void setStrategyTri(StrategyTrie strategyTri) {
        this.strategyTri = strategyTri;
    }
    public void effectuerTrie(){
        System.out.println("***************************");
        System.out.println("Préparation des données");
        System.out.println("***************************");

        strategyTri.Trie();

        System.out.println("***************************");
        System.out.println("Afficher des Résultat");
        System.out.println("***************************");
    }
}
