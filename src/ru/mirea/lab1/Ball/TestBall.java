/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mirea.lab1.Ball;

/**
 *
 * @author student
 */
public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball("Красный", 12.2);
        
        System.out.println(ball);
        ball.kickBall();
    }
}
