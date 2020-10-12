package pract_11;

public class Multiply extends Operation {

    public Multiply(Expression a, Expression b) {
        super(a, b);
    }

    public int evaluate(int left, int right) {
        return left * right;
    }

}