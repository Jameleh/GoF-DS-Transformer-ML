package game;

public class CombatManager {
    private static CombatManager instance = new CombatManager();
    private static String damageFormula = "experience / 20 * attack - defense";

    private CombatManager() {
    }

    public static CombatManager getInstance() {
        return instance;
    }

    public void applyDamage(Character attacker, Character receiver) {
        String expression;
        expression = damageFormula.replace("attack", Double.toString(attacker.getAttack()));
        expression = expression.replace("experience", Double.toString(attacker.getExperience()));
        expression = expression.replace("defense", Double.toString(receiver.getDefense()));
        InterpretadorExpressao interpreter = new InterpretadorExpressoesAritmeticas(expression);
        receiver.setLife(receiver.getLife() - (int)interpreter.interpretar());
    }

}
