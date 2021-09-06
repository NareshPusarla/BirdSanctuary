package com.bridgelabz.birdsanctuary;

public class Pigeon extends Bird implements Flyable {
	public Pigeon(String id) {
		this.id = id;
		color = "green";
		name = "Parrot";
	}

	public void fly() {
		System.out.println("Parrot is flying");
	}
}
