package com.zookeeper.mammal;

public class Mammal {
	protected int energyLevel = 100;

	public void displayEnergy() {
		System.out.printf("Mammals enegy level is currently at %s\n", energyLevel);
	}

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
		}
	
}
