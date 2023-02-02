package com.edu.Boletin_1;

import java.util.Scanner;

public class Boletin1_14 {
	
	public static void pedirNum () {
		Scanner sc=new Scanner (System.in);
		int numero=0;
		int contador=0;
		int mayorPares=0;
		double mediaImpares=0;
		int numPares=0;
		int numImpares=0;
		int contadorPar=0;
		int contadorImpar=0;
		int sumaImpares=0;
		System.out.println("Introduce un número: ");
		numero=Integer.valueOf(sc.nextLine());
		
		while (numero>=0) {
			contador++;
			numPares=numero%2==0?numero:numPares;
			contadorPar=numero%2==0?contadorPar+1:contadorPar;
			mayorPares=numPares>mayorPares?numPares:mayorPares;
			numImpares=numero%2!=0?numero:numImpares;
			contadorImpar=numero%2!=0?contadorImpar+1:contadorImpar;
			sumaImpares+=numImpares;
			mediaImpares=sumaImpares/contadorImpar;
			System.out.println("Introduce un número: ");
			numero=Integer.valueOf(sc.nextLine());
		}
		System.out.println("Los números introducidos son: " + contador);
		System.out.println("La media de los impares es: " + mediaImpares);
		System.out.println("El mayor de los pares es: " + mayorPares);
	}
	
	
	
	
	
	public static void main(String[] args) {
		pedirNum();

	}

}
