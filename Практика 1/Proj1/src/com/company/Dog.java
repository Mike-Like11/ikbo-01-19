package com.company;

public class Dog {
    private String name;
    private String color;
    Dog(String name, String color)
    {
        this.name = name;
        this.color = color;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "Name: "+ name + "\nColor: " + color;
    }
}
