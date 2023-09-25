package com.fatih1;

import java.util.Collection;
import java.util.TreeSet;

public class howework312 {

	public static void main(String[] args) {
		
		//Create the collection that will store single unique objects of a String type in which order is preserved.
	    //Write a logic to concatenate all string from the collection.
		
		Collection<String> store = new  TreeSet<>();
		
		store.add("Refrigerator");
		store.add("Wash Machine");
		store.add("Dryer");
		store.add("Vacuum Machine");
		
		for (String appliances : store) {
			System.out.print(appliances + " , ");
		}
		
		
		
	}
	
}
