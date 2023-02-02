package com.edu.Boletin_2;



public class Boltein2_9 {
	
	public static double toDecimal (String num) {
		
		int exponente=0;
		double num2=0;
		int decimal=0;
		
		
		for (int i=num.length()-1; 0<=i; i--) {
			num2= Math.pow(2, exponente);
			if (num.charAt(i)=='1') {
				decimal+=num2*1;
				exponente++;
				}else {
					exponente++;
				}
				}

			
				return decimal;
				}

	public static void main(String[] args) {
		
		System.out.println(toDecimal("11001"));
		
	}

}
