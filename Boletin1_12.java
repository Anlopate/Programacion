package com.edu.Boletin_1;

import java.util.Scanner;

public class Boletin1_12 {
	
	public static void contarNumeros () {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero=Integer.valueOf(sc.nextLine());
		int contador=0;
		
		while (numero>0) {
			contador++;
			System.out.println("Introduzca un número: ");
			numero=Integer.valueOf(sc.nextLine());
		}
		System.out.println("Se han introducido " + contador + " números.");
	}

	public static void main(String[] args) {
		contarNumeros();

	}

}
