package com.edu.Boletin_1;

import java.util.Scanner;

public class Boletin1_9 {
	
	public static void multiplo () {
		int numero;
		int contador=0;
		Scanner sc=new Scanner (System.in);
		
		for (numero=0; contador<=5 ; contador++) {
			System.out.println("Introduce un número: ");
			numero=Integer.valueOf(sc.nextLine());
			if (numero%3==0) {
				System.out.println(numero + " es múltiplo de 3.");
				
			}else
				System.out.println();
		}
		
	}
	public static void main(String[] args) {
		multiplo();
	}

}
