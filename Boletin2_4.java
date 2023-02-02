package com.edu.Boletin_2;

public class Boletin2_4 {

	
	public static String invertirCadena (String cadena) {
		
		String salida ="";
		
		for (int i =0; i<cadena.length(); i++) {
			
			if (i%2==0) {
			
			salida+=cadena.charAt(i+1);
			salida+=cadena.charAt(i);
		}
		}
		
		return salida;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(invertirCadena ("Hola mundo"));
	}

}
