package patterntest.expressions;

import patterntest.visitors.Visitor;

public class Literal implements Expression {

  private float arg;

  public Literal(float arg) {
    this.arg = arg;
  }

  @Override
  public void accept(Visitor v) {
    v.visitLeafLiteral(this);
  }

  @Override
  public String toString() {
    return Float.toString(arg);
  }

}
