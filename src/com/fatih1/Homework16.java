package com.fatih1;

public class Homework16 {
	
	//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
	
	public static void main(String[] args) {
		
		String str = "I am really motivated to learn Java";
		
		System.out.println(str.replaceAll(" ", ""));
		
		
		/*
		 * Create a String that should be combination of letters, numbers and special characters. 
		 * Find out how many alpha characters are there in the String. (alpha characters means letters)
		 */
		
		
		String combination = "167ag=HjZdF@#/*";
		System.out.println("The lenght of alpha characters are " + combination.length());
		
		
	}
	
	

}
