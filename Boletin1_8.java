package com.edu.Boletin_1;

import java.util.*;

public class Boletin1_8 {

	public static int sumar () {
		int numero=0;
		int contador=0;
		Scanner sc= new Scanner (System.in);
		for (numero=0; contador<=15; contador++) {
			System.out.println("Introduce un número:");
			numero+=Integer.valueOf(sc.nextLine());
		}
		return (numero);
	}
	public static void main(String[] args) {
		System.out.println(sumar());
		

	}

}
