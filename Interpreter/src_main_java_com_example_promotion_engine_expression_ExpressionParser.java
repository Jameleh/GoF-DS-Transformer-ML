package com.example.promotion_engine.expression;

import java.util.Stack;

public class ExpressionParser {

    public static Expression parse(String rule) {
        String[] tokens = rule.split(" ");
        Stack<Expression> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i].toUpperCase();

            switch (token) {
                case "VIP":
                    stack.push(new VipExpression());
                    break;
                case "TOTAL":
                    if (i + 2 < tokens.length && tokens[i + 1].equals(">")) {
                        stack.push(new TotalAmountExpression(Integer.parseInt(tokens[i + 2])));
                        i += 2;
                    }
                    break;
                case "ITEM_COUNT":
                    if (i + 2 < tokens.length && tokens[i + 1].equals(">=")) {
                        stack.push(new ItemCountExpression(Integer.parseInt(tokens[i + 2])));
                        i += 2;
                    }
                    break;
                case "AND":
                    if (stack.size() >= 2) {
                        Expression rightAnd = stack.pop();
                        Expression leftAnd = stack.pop();
                        stack.push(new AndExpression(leftAnd, rightAnd));
                    }
                    break;
                case "OR":
                    if (stack.size() >= 2) {
                        Expression rightOr = stack.pop();
                        Expression leftOr = stack.pop();
                        stack.push(new OrExpression(leftOr, rightOr));
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown token: " + token);
            }
        }
        return stack.pop();
    }
}