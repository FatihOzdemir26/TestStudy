package com.fatih1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW30 {
	
	/*
	 * Create a map of countries with its capital that will store countries in alphabetical order.
Add them randomly in the map.
Example:
    "France" -> "Paris"
    "Kosovo" -> "Prishtina"
    "Turkey" -> "Ankara"
    "USA" -> "Washington DC"
    "Albania" -> "Tirana"
    "Italy" -> "Rome"

    - Print the list and check the order of the countries.
    - Verify if you have your contry (Albania, Turkey) in the list ( use containsKey() method )
    - Verify if a specific capital city is in the list ( use containsValue() method )
    - Get all the keys (countries names) in a Set. Print all country names using for each loop.
    - Get all the values (capital names) in a Collection. Print all capital names using iterator.
	 */


	public static void main(String[] args) {
		
		Map<String,String> countries = new TreeMap<>();
		
		countries.put("France", "Paris");
		countries.put("Kosova", "Prishtina");
		countries.put("Turkiye", "Ankara");
		countries.put("USA", "DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");
		
		System.out.println(countries);
		
		boolean checkKeyA = countries.containsKey("Albania");
		boolean checkKeyT = countries.containsKey("Turkiye");
		System.out.println(checkKeyA);
		System.out.println(checkKeyT);
		
		boolean checkValue = countries.containsValue("Madrid");
		System.out.println(checkValue);
		
		Set<String> keys = countries.keySet();
		for (String el:keys) {
			System.out.print(el + " ");
		}
				
		System.out.println("\n--------------------");
		
		Collection<String> cn = countries.values();
		Iterator<String> abc = cn.iterator();
		
		while (abc.hasNext()) {
			System.out.print(abc.next() + " ");
		}

	}

}
