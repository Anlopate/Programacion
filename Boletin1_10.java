package com.edu.Boletin_1;

import java.util.Scanner;

public class Boletin1_10 {
	
	public static void sumarCien () {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numero = Integer.valueOf(sc.nextLine());
		int contador=0;
		int sumaNumero=0;	
		
		while (numero>0 && contador<=100) {
			numero++;
			sumaNumero+=numero;
			contador++;
		}
		System.out.println(sumaNumero);
		
	}
	

	public static void main(String[] args) {
		
		sumarCien();
	}

}
