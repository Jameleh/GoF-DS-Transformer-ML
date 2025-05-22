package com.example.promotion_engine.expression;


import com.example.promotion_engine.model.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ItemCountExpression implements Expression {
    private final int threshold;

    @Override
    public boolean interpret(Order order) {
        return order.getItemCount() >= threshold;
    }
}
