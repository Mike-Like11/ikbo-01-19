package pkg1para;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(3, "namedog");
        System.out.println("age = " + dog.getAge() + "\nname is " + dog.getName());
        
        Ball ball = new Ball(5, "blue");
        System.out.println("size = " + ball.getSize() + "\ncolor is " + ball.getColor());
    }
}