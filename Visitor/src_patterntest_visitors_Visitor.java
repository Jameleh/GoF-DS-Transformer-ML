package patterntest.visitors;

import patterntest.expressions.binaryexpressions.BinaryExpression;
import patterntest.expressions.Expression;
import patterntest.expressions.binaryexpressions.Addition;
import patterntest.expressions.binaryexpressions.Division;
import patterntest.expressions.binaryexpressions.Multiplication;
import patterntest.expressions.binaryexpressions.Subtraction;
import patterntest.expressions.Literal;

public interface Visitor {

  public void visitLeafAddition(Addition l);

  public void visitLeafDivision(Division l);

  public void visitLeafMultiplication(Multiplication l);

  public void visitLeafSubtraction(Subtraction l);

  public void visitLeafLiteral(Literal l);

}
