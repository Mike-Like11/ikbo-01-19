package pract_2;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(60, 60);
        System.out.println(b);
        b.move(10, 20);
        System.out.println(b);
    }
}
