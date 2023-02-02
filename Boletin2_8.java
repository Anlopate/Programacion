package com.edu.Boletin_2;

public class Boletin2_8 {
	
	
	public static String toBinary (int num) {
		int division=0;
		int resultado=num/2;
		int resto=num%2;
	    String binario=Integer.toBinaryString(resto);
	    String binarioDef="";
		
		while (resultado>2) {
			division=resultado;
			resultado=resultado/2;
			resto=division%2;
			binario+=resto;
			
		}if (resultado<2) {
			binario=binario+resultado;
			
			}for (int i=0; i<binario.length(); i++) {
				binarioDef=binario.charAt(i)+binarioDef;
		}
		
	
	return binarioDef;
}

	public static void main(String[] args) {
		
		System.out.println(toBinary(25));
	}

}
