package expression;
import constants.Numbers;
import context.NumberContext;

import java.util.ArrayList;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 26/06/2023 23:05
 */
public class NumberExpression implements INumberExpression {

    public void interpret(NumberContext context) {
        Integer number = context.number;
        ArrayList<String> numbersTanslations = new ArrayList<>();
        numbersTanslations.add(Numbers.ZERO);
        numbersTanslations.add(Numbers.ONE);
        numbersTanslations.add(Numbers.TWO);
        numbersTanslations.add(Numbers.THREE);
        numbersTanslations.add(Numbers.FOUR);
        numbersTanslations.add(Numbers.FIVE);
        numbersTanslations.add(Numbers.SIX);
        numbersTanslations.add(Numbers.SEVEN);
        numbersTanslations.add(Numbers.EIGHT);
        numbersTanslations.add(Numbers.NINE);
        ArrayList<String> numbersReversed = new ArrayList<>();
        while (number > 0) {
            int temp = number % 10;
            numbersReversed.add(numbersTanslations.get(temp));
            number = (number - temp) / 10;
        }
        context.result = new String();
        for (int i = numbersReversed.size() - 1; i >= 0; i--) {
            context.result += numbersReversed.get(i) + Numbers.SPACE;
        }
        context.result = context.result.substring(0, context.result.length() - 3);
    }
}
