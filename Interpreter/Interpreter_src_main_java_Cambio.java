public class Cambio {

    public static String formula = "dolar * 5.2 - taxa";

    public static double calcularDinheiro(double dinheiro1, double dinheiro2) {
        String expressao;
        expressao = formula.replace("dolar", Double.toString(dinheiro1));
        expressao = expressao.replace("taxa", Double.toString(dinheiro2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}