package com.example.promotion_engine.expression;

import com.example.promotion_engine.model.Order;

public class VipExpression implements Expression {
    @Override
    public boolean interpret(Order order) {
        return order.isVIP();
    }
}
