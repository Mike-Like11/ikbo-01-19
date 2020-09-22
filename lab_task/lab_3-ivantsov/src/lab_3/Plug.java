package lab_3;

public class Plug extends Dish {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Plug(boolean broken, int weight, int length) {
        super(broken, weight);
        this.length = length;
    }

    @Override
    public void breaken() {
        setBroken(true);
    }
}
