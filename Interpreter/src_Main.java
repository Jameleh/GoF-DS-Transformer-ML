import context.NumberContext;
import expression.NumberExpression;

/**
 * Created by: Apulatjonov
 * Date: 26/06/2023 23:05
 */
public class Main {
    public static void main(String[] args) {
        NumberExpression expression = new NumberExpression();
        NumberContext context = new NumberContext(170103);

        expression.interpret(context);
        String result = context.result;
        System.out.println("String is: ");
        System.out.println(result);
    }
}