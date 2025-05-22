package com.example.promotion_engine.expression;

import com.example.promotion_engine.model.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionParserTest {

    @Test
    void testParseVipAndTotalAmount() {
        Order order = new Order(1L, true, 1200, 3, null);

        String rule = "VIP AND TOTAL > 1000";
        Expression expression = ExpressionParser.parse(rule);

        assertTrue(expression.interpret(order));
    }

    @Test
    void testParseItemCountOrTotalAmount() {
        Order order = new Order(1L, false, 1001, 6, null);

        String rule = "ITEM_COUNT >= 5 OR TOTAL > 1000";
        Expression expression = ExpressionParser.parse(rule);

        assertTrue(expression.interpret(order)); // Beklenen sonuç: TRUE
    }

    @Test
    void testParseFalseCondition() {
        Order order = new Order(1L, false, 500, 2, null);

        String rule = "VIP AND TOTAL > 1000";
        Expression expression = ExpressionParser.parse(rule);

        assertFalse(expression.interpret(order));
    }
}