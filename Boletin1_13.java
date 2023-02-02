package com.edu.Boletin_1;

	
import java.util.Scanner;

public class Boletin1_13 {

	public static void numeroMxMn () {
		Scanner sc= new Scanner (System.in);
		//System.out.println("Introduce un número: ");
		int numero=0;
		int numMax=0;
		int numMin=0;
		int contador=1;
		
		while (contador<11){
			System.out.println("Introduce un número: ");
			numero=Integer.valueOf(sc.nextLine());	
		numMax=numero>numMax?numero:numMax;
		numMin=contador==1?numero:numMin;
		numMin=numero<numMin?numero:numMin;
		contador++;
		}
		System.out.println("El número máximo es: " + numMax);
		System.out.println("El número mínimo es: " + numMin);
	}
	public static void main(String[] args) {
		numeroMxMn();

	}

}
