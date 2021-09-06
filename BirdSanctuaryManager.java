package com.bridgelabz.birdsanctuary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.source.tree.SynchronizedTree;

public class BirdSanctuaryManager {
//	List<Bird> birdList = new ArrayList<Bird>();
	
	Set<Bird> birdList = new HashSet<Bird>();
	static BirdSanctuaryManager instance;
	
	private BirdSanctuaryManager() {
		
	}
	
	static synchronized BirdSanctuaryManager getInstance() {
		 if(instance == null) {
			 instance = new BirdSanctuaryManager();
		 }
		 return instance;
	}
	
	public void add(Bird bird) {
		birdList.add(bird);
	}
	
	public void remove(Bird bird) {
		birdList.remove(bird);
	}
	
	public void print() {
/*		for(Object bird: birdList) {
			System.out.println(bird);
		}
*/		
		birdList.stream().forEach(System.out::println);
	
	}
	
	public void printFlyable() {
		/*
		 * for(Object o: birdList) { if(o instanceof Flyable) { System.out.println(o); }
		 * }
		 */	
		birdList.stream().filter(element -> element instanceof Flyable).forEach(System.out::println);
	}
}
