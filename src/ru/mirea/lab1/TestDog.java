/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mirea.lab1;

/**
 *
 * @author student
 */
public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Стив", "Овчарка", 1);
        System.out.println(dog);
        dog.bark();
    }
}
