package com.company;

public class Tester {
    public static void startTest(){
        Ball ball = new Ball();
        ball.setJump(true);
        System.out.print(ball.toString() + " jump: " + ball.isJump() + "\n");

        Dog dog = new Dog(5);
        System.out.print(dog.toString() + " age = " + dog.getAge() + "\n");

        Book book = new Book("BLM");
        System.out.print(book.toString() + " : " + book.getName());
    }
}
