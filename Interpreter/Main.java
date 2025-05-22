interface Expression {
    public int interpret();
}

class NumberExpression implements Expression {
    private int number;
 
    public NumberExpression(int number) {
        this.number = number;
    }
 
    public int interpret() {
        return number;
    }
}

class AdditionExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
 
    public AdditionExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
 
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}

class InterpreterDemo {
    public static void main(String[] args) {
        Expression expression = new AdditionExpression(new NumberExpression(10), new NumberExpression(20));
        System.out.println("Result: " + expression.interpret());
    }
}
