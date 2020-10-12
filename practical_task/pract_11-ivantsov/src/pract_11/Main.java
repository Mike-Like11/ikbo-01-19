package pract_11;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(new Subtract(
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        ),
                        new Const(3)
                ).evaluate(5)
        );
    }
}
