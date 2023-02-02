package com.edu.Boletin_1;

public class Boletin1_18 {

	public static double calcularAreaCirculo (double radio) {
			
		double area = Math.PI*Math.pow(radio, 2);
		return (area);
	}
	
	public static double calculaLongitudAreaCirculo (double diametro) {
		
		double longitud = Math.PI*diametro;
		return (longitud);
		
	}
	public static void main(String[] args) {
		
		System.out.println("El área del cículo es: "+ calcularAreaCirculo (7.5));
		System.out.println("La longitud del círcuo es: " + calculaLongitudAreaCirculo (15.0));
		
	}

}
