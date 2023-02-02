package com.edu.Boletin_1;

import java.util.Scanner;

public class Boletin1_16 {

	public static void sueldos () {
		int sueldo =0;
		Scanner sc = new Scanner (System.in);
		int contador=0;
		int sumaSueldos=0;
		int contadorMayor=0;
		
		while (contador<=9) {
			System.out.println("Introduce el sueldo del empleado: ");
			sueldo=Integer.valueOf(sc.nextLine());
			sumaSueldos+=sueldo;
			contador++;
			if (sueldo>1000) {
				contadorMayor++;
			}
		}	
		System.out.println("La suma de los sueldos es: "+ sumaSueldos + ". Hay " +contadorMayor+ " sueldos mayor de 1000€.");
	}
	public static void main(String[] args) {
		sueldos();

	}

}
