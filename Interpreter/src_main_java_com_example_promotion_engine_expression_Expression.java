package com.example.promotion_engine.expression;

import com.example.promotion_engine.model.Order;

public interface Expression {
    boolean interpret(Order order);
}
