package com.edu.Boletin_1;

import java.util.Scanner;

public class Boletin1_1 {
	
	public static String asignatura (String dia) {
		String asignatura;
		if (dia.equalsIgnoreCase("Lunes")) {
			asignatura="BBDD";
		}else if (dia.equalsIgnoreCase("Martes")) {
			asignatura="Programación";
		}else if (dia.equalsIgnoreCase("Miércoles")){
			asignatura="Programación";
		}else if (dia.equalsIgnoreCase("Jueves")){
			asignatura="FOL";
		}else if (dia.equalsIgnoreCase("Viernes")) {
			asignatura="Programación";
		}else {
			asignatura="No hay clase";
		}
		return (asignatura);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String dia;
		System.out.println("Qué día es hoy?");
		dia = sc.nextLine();
		System.out.println(asignatura (dia));
		

	}

}
