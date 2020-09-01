public class Main {
    public static void main(String args[])
    {
        Dog dog = new Dog("Sharik");
        Ball ball = new Ball("Ball");
        Book book = new Book("MasterAndMargarita");

        TestForDog testForDog = new TestForDog(dog);
        TestForBall testForBall = new TestForBall(ball);
        TestForBook testForBook = new TestForBook(book);

        TestManager testManager = new TestManager(testForDog,testForBall,testForBook);
        testManager.startTesting();
    }
}
