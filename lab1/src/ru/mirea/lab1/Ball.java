package ru.mirea.lab1;

public class Ball {
	private int size;

	private String color;

	private double weight;

	public Ball(int size, String color, double weight) {
		this.size = size;
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Ball{" +
				"size=" + size +
				", color='" + color + '\'' +
				", weight=" + weight +
				'}';
	}
}
