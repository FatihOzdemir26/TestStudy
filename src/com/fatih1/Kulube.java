package com.fatih1;

public class Kulube {

	public static void main(String[] args) {
		
		Kopekler k1 = new Kopekler();
		k1.breed = "Husky";
		k1.color = "White";
		k1.age = 11;
		
		Kopekler k2 = new Kopekler();
		k2.breed = "Bulldog";
		k2.color = "Brown";
		k2.age = 16;
		
		Kopekler k3 = new Kopekler();
		k3.breed = "Labrador";
		k3.color = "Black";
		k3.age = 19;
		
		
		k1.run();
		k1.breed();
		k1.eat();
		

		k2.run();
		k2.breed();
		k2.eat();
		

		k3.run();
		k3.breed();
		k3.eat();

	}

}
