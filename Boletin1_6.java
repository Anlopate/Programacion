package com.edu.Boletin_1;
import java.util.*;
public class Boletin1_6 {

	

	public static void grados (int dia, int mes) {
		
		if ((dia>=21 && mes==12) || (dia<=20 && mes==3) || (dia>=1 && dia<=29 && mes==2)) {
			System.out.println("Estamos en invierno. La temperatura debe ser 19 grados");
			
		}else if ((dia>=20 && mes==3) || (dia<=21 && mes==6) || (dia>=1 && dia<=31 && mes==4 || mes==5)){
			System.out.println("Estamos en primavera. La temperatura debe ser 20 grados");
		}else if ((dia>=23 && mes==9) || (dia<=21 && mes==12) || (dia>=1 && dia<=31 && mes==10 || mes==11)){
			System.out.println("Estamos en otoño. La temperatura debe ser 19 grados");
		}else {
			System.out.println("Estamos en verano. La temperatura debe ser 24 grados");
	
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("¿Qué día es?");
		int dia=Integer.valueOf(sc.nextLine());
		System.out.println("¿Qué mes es?");
		int mes=Integer.valueOf(sc.nextLine());
		grados(dia,mes);
}
}
