import java.util.ArrayList;
import java.util.List;

public class InterpretMain {

	public static void main(String[] args) {

		Context contextObject = new Context("NEWOBJECT");
		List<AbstractExpression> expressionList = new ArrayList<AbstractExpression>();

		expressionList.add(new NonTerminalExpression());
		expressionList.add(new TerminalExpression());
		expressionList.add(new TerminalExpression());

		for (AbstractExpression expression : expressionList) {
			expression.interpret(contextObject);
		}

	}

}
