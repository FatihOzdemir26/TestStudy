package com.fatih1;

import java.util.Scanner;

public class HW163 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that reads two parent's first names and if they expecting boy or girl?
           Based on the input suggests a name for a baby:
           If it is a boy get half from dad and half from mom.
           If it is a girl get half from mom and half from dad.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter mother name: ");
		String mom =scan.next();
		
		System.out.println("Please enter father name: ");
		String dad =scan.next();
		
		System.out.println("Boy or girl ");
		String gender = scan.next();
		
		
		if (gender.equals("boy")) {
			System.out.println(dad.substring(0, 3) + mom.substring(2, 4));
		}

	}

}
