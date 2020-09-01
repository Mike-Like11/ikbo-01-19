package ru.mirea.lab1;

public class Dog {
	private String name;

	private int age;

	private String breed;

	private int weight;

	public Dog(String name, int age, String breed, int weight) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", age=" + age +
				", breed='" + breed + '\'' +
				", weight=" + weight +
				'}';
	}
}
