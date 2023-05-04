package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digita i km da percorrere");
		
		String userkm = in.nextLine() ;
		
		System.out.println("km da percorrere:" + userkm );
		
		int userKm = Integer.valueOf(userkm);
		
		System.out.println("Digita la tua età");
		
		String userAge = in.nextLine();
		
		System.out.println("età del passeggero:" + userAge );
		
		int age = Integer.valueOf(userAge);
		
		double priceKm = 0.21;
		
		double totalPrice = priceKm * userKm;
		
		double sconto;
		
		if( age < 18 ) {
			sconto = totalPrice * 20 / 100; 
			totalPrice = totalPrice - sconto;
		} else if (age >= 65 ) {
			sconto = totalPrice * 40 / 100;
			totalPrice = totalPrice - sconto;
		}
		
		System.out.println("Prezzo totale: " + totalPrice );
		
		
		
		in.close();
	}
}
