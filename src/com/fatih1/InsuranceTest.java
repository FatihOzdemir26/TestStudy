package com.fatih1;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {

		Car c = new Car("Progressive", "Honda");
		Pet p = new Pet("Aetna", "rabbit");
		Health h = new Health("Aetna");

		ArrayList<Insurance> cph = new ArrayList<>();
		cph.add(c);
		cph.add(p);
		cph.add(h);

		System.out.println("---------------");

		for (int i = 0; i < cph.size(); i++) {
			cph.get(i).getQuote();
			cph.get(i).cancelInsurance();

	   }
		
		System.out.println("----------------");
		
		for (Insurance element:cph) {
			element.getQuote();
			element.cancelInsurance();
		}
		
		System.out.println("-------------------");
		
		Iterator<Insurance> itr = cph.iterator();
		while(itr.hasNext()) {
			Insurance abc = itr.next();
			abc.getQuote();
			abc.cancelInsurance();
		}
	}

}
