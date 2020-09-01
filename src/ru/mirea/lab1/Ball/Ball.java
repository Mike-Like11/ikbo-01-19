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
public class Ball {
    private String color;
    private double diameter;

    public Ball(String color, double diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", diameter=" + diameter + '}';
    }

    public void kickBall(){
        System.out.println("Мячик катиться");
    }
    
}
