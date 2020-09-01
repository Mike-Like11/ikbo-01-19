package com.company;

public class Dog {
    private int legs=4;
    private int age;
    private String name;
    public Dog(int age, String name){
        this.age=age;
        this.name=name;
    }
    public String dog_says(){
        return "gav";
    }
    public String toString(){
        return "name: " + name +", age: " + age;
    }
}
