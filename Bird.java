package com.bridgelabz.birdsanctuary;

import java.util.Objects;

public abstract class Bird {
	public String color;
	public String name;
	public String id;

	public void getSound() {
		System.out.println(name + " making sound.");
	}

	@Override
	public String toString() {
		return "Bird [color = " + color + ", name = " + name + ", id = " + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(color, other.color) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

}
