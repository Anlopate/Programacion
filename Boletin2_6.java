package com.edu.Boletin_2;

public class Boletin2_6 {
	
	
	public static int horaMayor (int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		
		int respuesta=-1000;
		
		
		if ((hora1>=0 && hora1<=23) && (min1>=0 && min1<=59) && (seg1>=0 && seg1<=59) && (hora2>=0 && hora2<=23) && (min2>=0 && min2<=59) && (seg2>=0 && seg2<=59)) {
			
		if ((hora1>hora2) || (hora1==hora2 && min1>min2) || (hora1==hora2 && min1==min2 && seg1>seg2)){
			respuesta=1;
		}else if ((hora2>hora1) || (hora2==hora1 && min2>min1) || (hora2==hora1 && min2==min1 && seg2>seg1)) {
			respuesta=2;
		}else  {
			respuesta=0;
		
		}
		
	}
		return respuesta;
	}

	public static void main(String[] args) {
		
		System.out.println(horaMayor (22,30,21,22,30,21));
	}

}
