package com.edu.Boletin_1;

import java.util.Scanner;

public class Boletin1_11 {
	
	public static void cuadrado () {
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero=Integer.valueOf(sc.nextLine());
		int cuadrado=0;
		
		while (numero>0) {
			cuadrado=numero*numero;
			System.out.println("El cuadrado del número es " + cuadrado);
			System.out.println("Introduzca un número: ");
			numero=Integer.valueOf(sc.nextLine());
			
		}
		{
		}
		
	}
	

	public static void main(String[] args) {
		cuadrado();
		
			}

}
