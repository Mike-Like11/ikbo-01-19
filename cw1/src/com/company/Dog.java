package com.company;

public class Dog {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
