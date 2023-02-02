package com.edu.Boletin_1;

import java.util.*;

public class Boletin1_7 {

	/*A------------------------------------------*/
	public static void mostrarNumerosFor() {
		int numero;
		numero = 0;
		for (numero = 1; numero <= 100; numero++) {
			System.out.println(numero);
		}

	}

	public static void mostrarNumerosWhile() {
		int num;
		num = 0;
		while (num >= 0 && num <= 99) {
			num++;
			System.out.println(num);
		}

	}

	public static void mostrarNumerosDo() {
		int num;
		num = 1;

		do {
			System.out.println(num++);

		} while (num >= 1 && num <= 100);

	}
	/*B---------------------------------------------*/
	public static void numeroDescendenteFor () {
		int numero;
		numero=100;
		
		for (numero=100; numero>=1; numero--) {
			System.out.println(numero);
		}
		
		
	}
	
	public static void numDescendenteWhile () {
		int numero;
		numero=101;
		while (numero>1) {
			numero--;
			System.out.println(numero);
		}
	}
	
	public static void numDescendenteDo () {
		int numero;
		numero=100;
		do {
			System.out.println(numero--);
		}while (numero>=1);
	}
/*C--------------------------------------------------*/
	public static void multiploFor () {
		int numero;
		numero=0;
		
		for (numero=0; numero<=100; numero +=5) {
			System.out.println(numero);
		}
		
	}
	
	public static void multiploWhile() {
		int numero;
		numero=0;
		 while (numero%5==0 && numero<100){
			 numero+=5;
			 System.out.println(numero);
			 
		 }
	}
	
	public static void multiploDo() {
	int numero;
	numero=0;
	
	do {
		numero+=5;
		System.out.println(numero);
	}while (numero%5==0 && numero<100);{
		
	}
	}
/*D-------------------------------------------*/
	public static void contarFor () {
		int numero;
		numero=0;
		for (numero=320; numero>=160; numero-=20) {
			System.out.println(numero);
		}
			
	}
	
	public static void contarWhile () {
		int numero;
		numero=340;
		 while (numero>160) {
			 numero-=20;
			 System.out.println(numero);
		 }
	}
	
	public static void contarDo () {
		int numero;
		numero=340;
		do {
			numero-=20;
			System.out.println(numero);
		}while (numero>160);
			
		}
			
	
	public static void main(String[] args) {
		/* mostrarNumerosFor (); */
		/* mostrarNumerosWhile(); */
		/* mostrarNumerosDo(); */
		/*numeroDescendenteFor();*/
		/*numDescendenteWhile();*/
		/*numDescendenteDo();*/
		/*multiploFor();*/
		/*multiploWhile();*/
		/*multiploDo();*/
		/*contarFor();*/
		/*contarWhile();*/
		/*contarDo();*/
	}

}
