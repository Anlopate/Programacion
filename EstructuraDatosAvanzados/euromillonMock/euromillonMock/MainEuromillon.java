package euromillonMock;

import java.time.LocalDate;

public class MainEuromillon {


	public static void main(String[] args) {
		
		Historial h1 = new Historial ();
		Combinacion c1 = new Combinacion(1,2,3,4,5,6,7); 
		Combinacion c2 = new Combinacion (8,9,10,11,12,7,8);
		Combinacion c3 = new Combinacion (15,16,17,18,19,7,8);
		
		
		h1.addSorteo(12,3,2000, c3);
		
		
		h1.addSorteo(18,7,2005, c1);
		
		h1.addSorteo(15,7,2010, c2);
		
		
		h1.actualizarSorteo(12,3,2000 ,c2);
		
		
		try {
			System.out.println(h1.comprobarAciertos(LocalDate.of(2000, 3, 12), c2));
		} catch (HistorialException e) {
			
			e.printStackTrace();
		}
		
	}
		
	}