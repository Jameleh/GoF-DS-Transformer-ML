package patterntest.visitors;

import patterntest.expressions.binaryexpressions.Addition;
import patterntest.expressions.binaryexpressions.Division;
import patterntest.expressions.binaryexpressions.Multiplication;
import patterntest.expressions.binaryexpressions.Subtraction;
import patterntest.expressions.Literal;


/**
 * This Evaluator as a visitor has to implement all evaluating methods individually for each
 * class now ... they say this is useful so that we have alle these methods in one class
 * the visitor. I do the operation itself here, because that is what it is thought to be in the 
 * pattern. However, I'd prefer to do an abstract getResult() method in the class Binary Expression
 * and then make the implementation in the methods. 
 */
public class TermEvaluator implements Visitor {
  
  @Override
  public void visitLeafAddition(Addition l) {
    System.out.print(Float.toString(l.getFirstArg() + l.getSecondArg()));
  }

  @Override
  public void visitLeafDivision(Division l) {
    System.out.print(Float.toString(l.getFirstArg() / l.getSecondArg()));
  }

  @Override
  public void visitLeafMultiplication(Multiplication l) {
    System.out.println(Float.toString(l.getFirstArg() * l.getSecondArg()));
  }

  @Override
  public void visitLeafSubtraction(Subtraction l) {
    System.out.print(Float.toString(l.getFirstArg() - l.getSecondArg()));
  }

  @Override
  public void visitLeafLiteral(Literal l) {
    System.out.print(l);
  }
}
