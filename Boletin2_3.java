package com.edu.Boletin_2;

public class Boletin2_3 {
	
	public static String contFuerte (String contra) {
		
		boolean minuscula=false;
		boolean mayuscula=false;
		boolean digito=false;
		boolean signo = false;
		String mensaje="";
		
		if (contra.length()>=8) {
		
		for (int i =0; i<contra.length(); i++) {
			
			char caracter = contra.charAt(i);
			
			if (Character.isLowerCase(caracter)){
				minuscula=true;	
			}else if (Character.isUpperCase(caracter)) {
				mayuscula=true;
			}else if (Character.isDigit(caracter)) {
				digito=true;
			}else {
				signo=true;
			
			}
	
		}
		}
			if (mayuscula==true && minuscula==true && digito==true && signo==true) {
				mensaje="La contraseña es fuerte.";
			}else {
				mensaje="La contraseña no es fuerte.";
			}
			
		return mensaje;
	}
	

	public static void main(String[] args) {
		
		System.out.println(contFuerte("An9mm0_1"));
		

	}

}
