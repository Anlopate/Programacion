package com.edu.Boletin_1;

import java.util.*;


	
	public class Boletin1_4 {
		public static String calcularNotaFinal (double notaPractica,double notaProblemas, double notaTeorica) {
			double notaFinal;
			String calificacion="";
			notaFinal = (notaPractica*0.10)+(notaProblemas*0.50)+(notaTeorica*0.40);
    	if ((notaPractica <0 && notaPractica >10) || (notaTeorica < 0 && notaTeorica>10) || (notaProblemas<0 && notaProblemas<10)) {
    		calificacion="La nota no es correcta.";
    		
    		}else if(notaFinal<=5 && notaFinal<6) {
    			calificacion= "Suficiente.";
    		}else if (notaFinal>=6 && notaFinal<7) {
    			calificacion= "Bien.";
    		}else if (notaFinal>=7 && notaFinal<9) {
    			calificacion= "Notable.";
    		}else {
    			calificacion="Sobresaliente.";
    		}
        		
    		return ("La nota es: " + notaFinal +" " + calificacion);
    		
    	}
	    public static void main (String[] args) {
	    	
	    	System.out.println (calcularNotaFinal(3.5, 5.7, 8.2));
	    	
	    	
	    	}
	    	
	    }
	       
	