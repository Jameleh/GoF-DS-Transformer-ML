package ImpreterDesignPattern;

import java.util.Stack;

public class MainTest {

	public static void main(String[] args) {

		// stack-lifo
		String tokenString = "7 3 - 2 1 + *";
		Stack<Expression> stack = new Stack<>();
		String[] tokenArray = tokenString.split("\\s+");
		for (String s : tokenArray) {
			if (ExpressionUtils.isOperator(s)) {
				Expression rightExpression = stack.pop();
				Expression leftExpression = stack.pop();
				Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
				int result = operator.interpret();
				stack.push(new Number(result));
			} else {
				Expression i = new Number(Integer.parseInt(s));
				stack.push(i);
			}
		}
		System.out.println("( " + tokenString + " ): " + stack.pop().interpret());
	}

}
