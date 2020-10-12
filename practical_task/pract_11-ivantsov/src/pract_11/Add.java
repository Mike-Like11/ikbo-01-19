package pract_11;

public class Add extends Operation {
    public Add(Expression a,Expression b) {
        super(a,b);
    }

    public  int evaluate(int left, int right) {
        return left + right;
    }
}
