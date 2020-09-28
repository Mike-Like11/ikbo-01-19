package lab_9;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Введите целое число: ");
        String a = myScanner.next();
        try {
            int i = Integer.parseInt(a);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println(" не надо делить на 0");
        } catch (Exception e) {
            System.out.println("не целое");
        }
        finally {
            System.out.println("F");
        }
    }
}
