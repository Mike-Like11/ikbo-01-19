package pract_11;

public abstract class Operation implements Expression {
    private final Expression left;
    private final Expression right;

    public Operation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    public int evaluate(int x) {
        return evaluate(left.evaluate(x), right.evaluate(x));
    }

}
