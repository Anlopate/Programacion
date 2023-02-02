package com.edu.Boletin_2;

import java.util.Scanner;

public class Boletin2_5 {
	
	public static boolean esMultiplo (int num1,int num2) {
		
		boolean multiplo=true;
		
		if (num1%num2==0) {
			multiplo=true;
		}else {
			multiplo=false;
		}
	
		
		return multiplo;
	}

	public static void main(String[] args) {

		System.out.println(esMultiplo(21,3));
		

	}

}
