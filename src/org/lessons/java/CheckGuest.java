package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] listGuest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		
		System.out.println("Inserisci il tuo nome");
		String userName = sc.nextLine();
		
		
		String message = null;
		for (int i = 0; i < listGuest.length ; i++) {
			if(userName == listGuest[i]) {
				message = "Benvenuto alla festa";
			} else {
				message = "Non sei invitato alla festa";
			}
		}
		System.out.println(message);
		sc.close();
	}

}
