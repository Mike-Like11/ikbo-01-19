package com.company;

public class Ball {
    private String appointment;
    private int radius;
    private String color;
    private String form;

    public Ball(String appointment, String color, int radius, String form){
        this.appointment=appointment;
        this.radius=radius;
        this.color=color;
        this.form=form;
    }
    public String toString(){
        return "appointment: " + appointment +", radius: " + radius + ", color: " + color + ", form: " + form;
    }
}
