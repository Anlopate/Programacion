package com.edu.Boletin_2;

public class Boletin2_10 {
	
	
		 public static int gdc (int num1, int num2) {
			 
		        int resto;
		        
		        while (num2 != 0) {
		           resto = num2;
		            num2 = num1 % num2;
		            num1 = resto;
		        }
		        return num1;
		    }
			

	public static void main(String[] args) {
		
				System.out.println(gdc (1220,516));
	}

}
