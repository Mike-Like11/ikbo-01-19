package lab_9;

public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Попытка деления на 0 ");
        }
    }
}