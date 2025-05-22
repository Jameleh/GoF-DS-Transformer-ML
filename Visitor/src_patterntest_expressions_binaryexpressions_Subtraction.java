package patterntest.expressions.binaryexpressions;

import patterntest.expressions.Expression;
import patterntest.visitors.Visitor;

public class Subtraction extends BinaryExpression {

  private float firstArg;
  private float secondArg;

  public Subtraction(float firstArg, float secondArg) {
    this.firstArg = firstArg;
    this.secondArg = secondArg;
  }

  @Override
  public void accept(Visitor v) {
    v.visitLeafSubtraction(this);
  }

  @Override
  public String toString() {
    return firstArg + " - " + secondArg;
  }

  @Override
  public Subtraction getOperation() {
    return this;
  }

  public float getFirstArg() {
    return firstArg;
  }

  public float getSecondArg() {
    return secondArg;
  }
}
