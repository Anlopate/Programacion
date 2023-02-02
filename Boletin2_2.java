
package com.edu.Boletin_2;

import java.util.Scanner;

public class Boletin2_2 {
 
	public static String numeroReves (String num) {
		int longitud= num.length();
		int contador=0;
		String numReves= "";
	
		for (int i=longitud-1; i>=0; i--) {
			numReves+=num.charAt(i);	
		}	
		return numReves;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		String num=sc.nextLine();
		System.out.println(numeroReves(num));
	}

}
