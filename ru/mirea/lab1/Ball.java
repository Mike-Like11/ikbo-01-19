package ru.mirea.lab1;

public class Ball {
    private int radius;
    private String color;
    public Ball(){
        radius = 10;
        color = "blue";
    }
    public String toString(){
        return "Ball's radius: " + radius + " " + "Ball's color: " + color;
    }
}
