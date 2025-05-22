package com.sn.mane.interpreter;

public class TerminalExpression extends AbstractExpression {

    private boolean data;

    public TerminalExpression(boolean data) {
        this.data = data;
    }

    @Override
    void interpret(Context context) {
        // add operand to context
        context.addOperand(this.data);
    }
}
