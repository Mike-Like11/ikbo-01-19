package pract_11;

public class Subtract extends Operation {
    public Subtract(Expression a,Expression b) {
        super(a,b);
    }

    public int evaluate(int left, int right) {
        return left - right;
    }
}