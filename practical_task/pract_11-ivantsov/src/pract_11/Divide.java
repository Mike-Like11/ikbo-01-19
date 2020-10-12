package pract_11;

public class Divide extends Operation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }
    public int evaluate(int left, int right) {
        return left / right;
    }
}