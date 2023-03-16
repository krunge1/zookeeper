package com.zookeeper.gorilla;
import com.zookeeper.mammal.*;

public class Gorilla extends Mammal {
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
		System.out.println("Welcome Gorilla");
	}
	
//Setters//
	
	//Reduce the energy level for Gorilla
	public void throwThings() {
		energyLevel -= 5;
		System.out.printf("The gorilla is throwing stuff again.\n");
		displayEnergy();
	}
	
	public void climbThings() {
		energyLevel -= 10;
		System.out.printf("The gorilla climbed a tree.\n");		
		displayEnergy();
	}
	
	// Set the energy level for Gorilla
	public void eatBanana() {
		energyLevel += 10;
		System.out.printf("The gorilla ate a banana and is happy.\n");
		displayEnergy();
	
	}
	
	
}