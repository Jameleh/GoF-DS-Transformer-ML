package patterntest.expressions.binaryexpressions;

import patterntest.expressions.Expression;
import patterntest.visitors.Visitor;


public class Addition extends BinaryExpression {

  private float firstArg;
  private float secondArg;

  public Addition(float firstArg, float secondArg) {
    this.firstArg = firstArg;
    this.secondArg = secondArg;
  }


  @Override
  public void accept(Visitor v) {
    v.visitLeafAddition(this);
  }

  @Override
  public String toString() {
    return firstArg + " + " + secondArg;
  }

  @Override
  public Addition getOperation() {
    return this;
  }

  public float getFirstArg() {
    return firstArg;
  }

  public float getSecondArg() {
    return secondArg;
  }
}
