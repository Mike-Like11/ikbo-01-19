package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Dog dog=new Dog();
        Ball ball=new Ball();
        Book book=new Book();
        dog.setName(in.next());
        ball.setName(in.next());
        book.setName(in.next());
        System.out.println(dog);
        System.out.println(ball);
        System.out.println(book);
    }
}
