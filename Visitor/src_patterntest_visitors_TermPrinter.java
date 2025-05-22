package patterntest.visitors;

import patterntest.expressions.binaryexpressions.BinaryExpression;
import patterntest.expressions.Expression;
import patterntest.expressions.binaryexpressions.Addition;
import patterntest.expressions.binaryexpressions.Division;
import patterntest.expressions.binaryexpressions.Multiplication;
import patterntest.expressions.binaryexpressions.Subtraction;
import patterntest.expressions.Literal;

/**
 * This Printer as a visitor has to implement all printing methods individually for each
 * class now ... they say this is useful so that we have alle these methods in one class
 * the visitor.
 */
public class TermPrinter implements Visitor {

  @Override
  public void visitLeafAddition(Addition l) {
    System.out.print(l);
  }

  @Override
  public void visitLeafDivision(Division l) {
    System.out.print(l);
  }

  @Override
  public void visitLeafMultiplication(Multiplication l) {
    System.out.print(l);
  }

  @Override
  public void visitLeafSubtraction(Subtraction l) {
    System.out.print(l);
  }

  @Override
  public void visitLeafLiteral(Literal l) {
    System.out.print(l);
  }

}
