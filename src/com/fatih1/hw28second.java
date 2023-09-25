package com.fatih1;

import java.util.*;

public class hw28second {
	
	//Create an arrayList of even numbers from 1 to 50. 
	//Using Iterator remove any number that is divisible by 5 from that arrayList.

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			if ( i%2 == 0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		
		Iterator <Integer> num = numbers.iterator();
		while (num.hasNext()) {
			int a = num.next();
			if (a%5 == 0) {
				num.remove();
			}
					
		}
		System.out.println(numbers);

	}

}
