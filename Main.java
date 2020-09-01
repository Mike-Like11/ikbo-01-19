package com.company;


public class Main {

    public static void main(String[] args) {
	Dog dog = new Dog("Bob");
	Ball ball =  new Ball(5);
	Book book = new Book (300);

	System.out.println("Dog name: " + dog.toString());
	System.out.println("Ball size: " + ball.toString1());
	System.out.println("Book size: " + book.toString2());
    }
}
