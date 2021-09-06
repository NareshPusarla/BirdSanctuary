package com.bridgelabz.birdsanctuary;

import java.util.Scanner;

public class Main {
	BirdSanctuaryManager dataManager = BirdSanctuaryManager.getInstance();

	public void menu() {
		boolean choice = true;
		while (choice) {
			System.out.println("Choose an option from below: ");
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Print");
			System.out.println("10. Exit");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the operation you want: ");
			int input  = sc.nextInt();
			
			switch (input) {
			case 1: 
				System.out.println("Welcome to the bird sanctuary");
				Bird duck = new Duck("d1");
				Bird parrot = new Parrot("p1");
				Bird penguin = new Penguin("pe1");
				Bird pigeon = new Pigeon("pg1");

				dataManager.add(duck);
				dataManager.add(parrot);
				dataManager.add(penguin);
				dataManager.add(penguin);
				break;
			case 2:
				break;
			case 3:
				dataManager.print();
				break;
			case 10:
				choice = false;
				break;
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * System.out.println("Welcome to the bird sanctuary"); Bird duck = new
		 * Duck("d1"); Bird parrot = new Parrot("p1"); Bird penguin = new
		 * Penguin("pe1"); Bird penguin1 = new Penguin("pe1");
		 * 
		 * BirdSanctuaryManager dataManager = new BirdSanctuaryManager();
		 * dataManager.add(duck); dataManager.add(parrot); dataManager.add(penguin);
		 * dataManager.add(penguin); dataManager.add(penguin1);
		 * 
		 * dataManager.print();
		 * 
		 * System.out.println("penguin is removing");
		 * 
		 * // dataManager.remove(penguin); dataManager.print();
		 * System.out.println("Printing flyable birds"); dataManager.printFlyable();
		 */	
		Main main = new Main();
		main.menu();
	}

}
