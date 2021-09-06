package com.bridgelabz.birdsanctuary;

public class Penguin extends Bird implements Swimmable {
	public Penguin(String id) {
		this.id = id;
		color = "black";
		name = "Penguin";		
	}
	
	@Override
	public void swim() {
		System.out.println("Penguin is swimming");
	}
	/*
	 * @Override public void fly() { }
	 */
}
