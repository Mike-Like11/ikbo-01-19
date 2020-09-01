import com.sun.org.apache.xpath.internal.operations.Bool;

public class TestManager {
    private TestForDog testForDog;
    private TestForBook testForBook;
    private TestForBall testForBall;

    TestManager(TestForDog testForDog,TestForBall testForBall,TestForBook testForBook)
    {
        this.testForDog = testForDog;
        this.testForBook = testForBook;
        this.testForBall = testForBall;
    }

    public void startTesting()
    {
        printResult(testForDog.test(),testForDog.toString());
        printResult(testForBook.test(),testForBook.toString());
        printResult(testForBall.test(),testForBall.toString());
    }

    private void printResult(Boolean result,String className)
    {
        if(result)
            System.out.println(className+" Работает хорошо");
        else
            System.out.println(className+" Работает плохо");
    }
}
