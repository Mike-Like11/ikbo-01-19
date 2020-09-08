package lab_3;

public class Plate extends Dish {
    private  int radius;

    public Plate(boolean broken, int weight) {
        super(broken, weight);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                "broken='" + isBroken() + '\'' +
                ", weight=" + getWeight() +
                '}';
    }

    public Plate(boolean broken, int weight, int radius) {
        super(broken, weight);
        this.radius = radius;
    }

    @Override
    public void breaken() {
      setBroken(true);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
