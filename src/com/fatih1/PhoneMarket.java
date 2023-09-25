package com.fatih1;

public class PhoneMarket {

	public static void main(String[] args) {
		
		
		Phone phone1 = new Phone();
		phone1.brand = "IPhone";
		phone1.model = "14";
		phone1.screen = 6;
		
		Phone phone2 = new Phone();
		phone2.brand = "Samsung";
		phone2.model = "s23";
		phone2.screen = 4;
		
		Phone phone3 = new Phone();
		phone3.brand = "Nokia";
		phone3.model = "N90";
		phone3.screen = 2;
		
		
		phone1.call();
		phone1.touchscreen();
		phone1.facetime();
		
		phone2.call();
		phone2.touchscreen();
		phone2.facetime();
		
		phone3.call();
		phone3.touchscreen();
		phone3.facetime();
		
		
	}

}
