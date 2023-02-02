package com.edu.Boletin_2;

public class Boletin2_1 {
	
	public static String numeroSolucionesEcuacionSegundoGrado (double a, double b, double c) {
		double raiz = Math.sqrt(Math.pow (b,2) - 4*(a*c));	
		double x1 = 0;
		double x2 = 0;
		
		
		x1=(-b+raiz)/(2*a);
		x2=(-b-raiz)/(2*a);
			
		return ("x1="+ x1 + " x2="+ x2);	
			
			
			
		}
		
		
	

	public static void main(String[] args) {
		
		System.out.println(numeroSolucionesEcuacionSegundoGrado(1, -5, 6));
		
	}

}
