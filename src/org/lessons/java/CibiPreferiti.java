package org.lessons.java;

public class CibiPreferiti {
	
	public static void main(String[] args) {

		String[] cibi = { "pizza", "sushi", "pollo", "parmigiana", "tiramisu"};
		
		System.out.println("Lunghezza classifica: " + cibi.length);
		
		System.out.println("Cibo top: " + cibi[0]);
		
		System.out.println("Cibo preferito ma non troppo: " + cibi[cibi.length-1]);
		
		System.out.println("Cibo di metà classifica: " + cibi[cibi.length/2]);
	}
		
}

