package com.bridgelabz.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable {
	public Duck(String id) {
		this.id = id;
		color = "white";
		name = "Duck";		
	}
	
	@Override
	public void fly() {
		System.out.println("Duck is flying");
	}
	
	@Override
	public void swim() {
		System.out.println("Duck is swimming");
	}
}
