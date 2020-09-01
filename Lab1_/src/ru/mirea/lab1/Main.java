package ru.mirea.lab1;

public class Main {
    public static void main(String[] args){
        Dog sheila = new Dog();
        sheila.height = 40;
        sheila.weight = 10.2f;
        System.out.println(sheila.height);
        System.out.println(sheila.weight);

        Dog lucky = new Dog();
        lucky.height = 58;
        lucky.weight = 15.3f;
        System.out.println(lucky.height);
        System.out.println(lucky.weight);

        Ball b = new Ball();
        b.diameter = 10;
        b.color = "red";
        b.displayInfo();

        Ball myach = new Ball();
        myach.diameter = 20;
        myach.color = "orange";
        myach.displayInfo();



        Book vampires = new Book();
        vampires.pages = 500;
        vampires.thickness = 7.8f;
        vampires.displayInfo();

        Book nikogde = new Book();
        nikogde.pages = 239;
        nikogde.thickness = 4.7f;
        nikogde.displayInfo();

    }

}
