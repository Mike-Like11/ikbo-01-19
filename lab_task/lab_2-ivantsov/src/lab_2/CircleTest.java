package lab_2;

public class CircleTest {

    public static void main(String[] args) {
	// write your code here
        Circle c=new Circle();
        c.setRadius(5);
        System.out.println(c);
        System.out.println("Square: "+c.getArea()+" Perimeter: "+c.getPerimeter());
    }
}
