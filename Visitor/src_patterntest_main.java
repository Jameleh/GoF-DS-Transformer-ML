package patterntest;

import patterntest.expressions.binaryexpressions.Addition;
import patterntest.expressions.binaryexpressions.BinaryExpression;
import patterntest.expressions.binaryexpressions.Multiplication;
import patterntest.visitors.TermEvaluator;
import patterntest.visitors.TermPrinter;
import patterntest.visitors.Visitor;

public class main {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    BinaryExpression binaryExpression = new Multiplication(5, 3);

    System.out.println("Printing the Expression:");
    Visitor visitor = new TermPrinter();
    binaryExpression.accept(visitor);

    System.out.println();
    System.out.println("And the Result is: ");
    Visitor visitor1 = new TermEvaluator();
    binaryExpression.accept(visitor1);
  }
}