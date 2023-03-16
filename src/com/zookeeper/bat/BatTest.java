package com.zookeeper.bat;

public class BatTest {
	public static void batTest(){

		// Testing Environment for class setups//
		
		//**** Gorilla Testing ****
		System.out.println("\n**** Bat Testing ****\n");
		Bat b1 = new Bat(300);
		b1.attackTown();
		b1.attackTown();
		b1.attackTown();
		b1.eatHuman();
		b1.eatHuman();
		b1.fly();
		b1.fly();
	}
}
