package com.sn.mane.interpreter;

import java.util.List;

public class OrExpression extends AbstractExpression  {

    private AbstractExpression firstAbstractExpression;
    private AbstractExpression secondAbstractExpression;

    public OrExpression(AbstractExpression firstAbstractExpression,
                        AbstractExpression secondAbstractExpression) {
        this.firstAbstractExpression = firstAbstractExpression;
        this.secondAbstractExpression = secondAbstractExpression;
    }

    public void interpret(Context context) {

        firstAbstractExpression.interpret(context);
        secondAbstractExpression.interpret(context);

        List<Boolean> operands = context.getOperands();

        Boolean firstOperand = operands.get(0);
        Boolean secondOperand = operands.get(1);

        Boolean result = firstOperand || secondOperand;
        context.setResult(result);
    }
}
