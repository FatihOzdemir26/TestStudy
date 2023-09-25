package com.fatih1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class HW31 {

	public static void main(String[] args) {
		
		/*
		 *  Create a Map that will store Employee name and salary. 
		 *  Write a logic to retrieve an employee who gets the highest salary.Output should be in the below format
	        - John Smith=$100000
		 */

		Map<String, Integer> empsal = new TreeMap<>();
		empsal.put("Fatih Ozdemir", 87000);
		empsal.put("Liliana Zikeyeva", 96000);
		empsal.put("Adam Smith", 103000);
		empsal.put("Uncle Sam", 46000);
		
		System.out.println(empsal);
		
		Set<Entry<String, Integer>> empentry = empsal.entrySet();
		Integer maxSalary = Collections.max(empsal.values());
		
		Iterator<Entry<String, Integer>> itr = empentry.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> employee = itr.next();
			
			if (employee.getValue()>= maxSalary) {
				System.out.println(employee.getKey() + " = $" + employee.getValue());
			}
			
		}
				
		
		
		
	}

}
