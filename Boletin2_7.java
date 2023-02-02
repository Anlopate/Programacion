package com.edu.Boletin_2;

public class Boletin2_7 {
	
	public static int segundosEntre (int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
	int segHora1=0;
	int segHora2=0;
	int segDiferencia=0;
	int respuesta=-1000;
	
	
		if ((hora1>=0 && hora1<=23) && (min1>=0 && min1<=59) && (seg1>=0 && seg1<=59) && (hora2>=0 && hora2<=23) && (min2>=0 && min2<=59) && (seg2>=0 && seg2<=59)) {
			segHora1=hora1*3600+min1*60+seg1;
			segHora2=hora2*3600+min2*60+seg2;
			segDiferencia=segHora1-segHora2;
			if (segDiferencia>0) {
			respuesta=segDiferencia;
		}			
	
		}
			return respuesta;
	}
	public static void main(String[] args) {
		
		System.out.println(segundosEntre (14,00,23,13,10,01));

	}

}
