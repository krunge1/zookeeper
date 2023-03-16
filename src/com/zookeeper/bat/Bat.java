package com.zookeeper.bat;
import com.zookeeper.mammal.*;

public class Bat extends Mammal {
	public Bat(int energyLevel) {
		super(energyLevel);
		System.out.println("Welcome bat!!");
	}
	
	//Reduce the energy level for Bat
		public void fly() {
			energyLevel -= 50;
			System.out.printf("Screechhh. Bat flew.\n");
			displayEnergy();
		}
	
		public void attackTown() {
			energyLevel -= 100;
			System.out.printf("Town is on fire!!! Bat burned everything\n");
			displayEnergy();
		}
     		
		// Set the energy level for Bat
		public void eatHuman() {
			energyLevel += 25;
			System.out.printf("Yeah the bat ate another one....\n");
			displayEnergy();	
		}
	
}
