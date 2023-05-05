package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] listGuest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		
		System.out.println("Inserisci il tuo nome");
		String userName = sc.nextLine();
		
		
		for (int i = 0; i < listGuest.length ; i++) {
			
			String guest = listGuest[i];
			if(userName.equals(guest)) {
				System.out.println("Benvenuto alla festa!");
				return;
			} else {
				System.out.println("Non sei invitato alla festa");
				return;
			}
		}
		
		sc.close();
	}

}
