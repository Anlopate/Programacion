package com.edu.Boletin_1;

import java.util.Scanner;

public class Boletin1_17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int contador;
        int num1;
        int num2;
        int vuelta;
  
                
        num1=1;
        num2=1;
        contador=12;
        System.out.print(num1 + " ");
        for(vuelta=2;vuelta<=contador;vuelta++){
            System.out.print(num2 + " ");
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
        System.out.println();
    }
}
