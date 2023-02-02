package com.edu.Boletin_1;

import java.util.Scanner;

public class Boletin1_3 {
	
	public static String tipoCaracter (char caracter) {
		String tipo;
		int codigo= (int)caracter;
		tipo =" ";
		if (caracter>=30 && caracter <=39) {
			tipo="Dígito entre 0 y 9.";
		}else if (caracter>=65 && caracter<=90) {
			tipo="Letra mayúscula.";
		}else if (caracter>=97 && caracter<=122) {
			tipo="Letra minúscula.";
		}else if (caracter>=33 && caracter<=46) {
			tipo="Signos de puntuación.";
		}else if (caracter==32){
			tipo="Espacio en blanco.";
		}else if (caracter==40 || caracter==41 ||caracter==123 || caracter==125) {
			tipo="Es paréntesis o llaves.";
		}else  {
			tipo="Otro carácter.";
		}
		return (tipo);
	
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		char caracter;
		System.out.println("Introduce un  caracter");
		caracter=sc.nextLine().charAt(0);
		System.out.println(tipoCaracter(caracter));	
	}
	}


