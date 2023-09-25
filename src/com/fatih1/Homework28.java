package com.fatih1;

import java.util.*;

public class Homework28 {
	
	//Create an arrayList of drinks. If any drink has letter "a" or "e" replace it with water. 

	public static void main(String[] args) {
		ArrayList<String> drinks = new ArrayList<>();
		
		drinks.add("Ice tea");
		drinks.add("ginger ale");
		drinks.add("Lemonade");
		drinks.add("gin tonic");
		
		System.out.println(drinks);
		
		for (int i=0;i<drinks.size();i++) {
			String drink = drinks.get(i);
			if(drink.contains("a")|| drink.contains("e")) {
				drinks.set(i, "water");
			}
			
		} 
		System.out.println(drinks);
		
	}
	

}
