package Solution2WithCompositeDesign;

public class Expression implements ArithmeticExpression{
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;

    Operation operation;
}
