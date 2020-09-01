package ru.mirea.lab1;

public class Dog {
    private String name;
    private String breed;
    public Dog(){
        name = "Doggy";
        breed = "Korgi";
    }
    public String toString(){
        return "Dog name: " + name + " " + "Dog breed: " + breed;
    }
}
