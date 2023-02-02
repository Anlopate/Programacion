package com.edu.Boletin_1;

import java.util.*;


public class Boletin1_5 {

	public static void saludo (int hora) {
	
		
		if (hora >=6 && hora <=12) {
			System.out.println("Buenos días.");
		}else if (hora >=13 && hora <=20) {
			System.out.println("Buenas tardes.");
		}else
			System.out.println("Buenas noches.");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Qué hora es?");
		int hora = Integer.valueOf(sc.nextLine());
		saludo(hora);
		
		
	}

}
