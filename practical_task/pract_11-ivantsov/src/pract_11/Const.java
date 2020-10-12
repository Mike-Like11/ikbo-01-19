package pract_11;

public class Const implements Expression {
    private final int x_value;

    public Const(int x_value) {
        this.x_value = x_value;
    }

    public int evaluate(int x) {
        return x_value;
    }

    @Override
    public int evaluate(int x, int y) {
        return 0;
    }
}
