package patterntest.expressions;

import patterntest.visitors.Visitor;

public interface Expression {

  public void accept(Visitor v);
}
