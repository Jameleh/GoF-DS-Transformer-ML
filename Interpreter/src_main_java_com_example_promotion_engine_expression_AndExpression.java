package com.example.promotion_engine.expression;

import com.example.promotion_engine.model.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AndExpression implements Expression {
    private final Expression expr1;
    private final Expression expr2;

    @Override
    public boolean interpret(Order order) {
        return expr1.interpret(order) && expr2.interpret(order);
    }
}