package boletin_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ordenInverso {

	
	protected static <T> T [] reverse (T [] arrayOriginal) {
		
		 T [] nuevoArray = arrayOriginal.clone();
		 
		 
		for (int i=arrayOriginal.length-1, contador=0; i>=0; i--, contador++) {
			
			nuevoArray[i]=arrayOriginal[contador];
			
		}
		
		return nuevoArray;
	}
	
	public static void main(String[] args) {
		
		Integer [] arrayOriginal = {1,2,3,4,5};
		
		
		System.out.println(Arrays.toString(reverse(arrayOriginal)));
		
	}
		
		
		
}
