package euromillonMock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Historial {

	
	private Map <LocalDate, Combinacion> sorteos;
	

	public Historial() {
		super();
		this.sorteos = sorteos;
	}
	
	public boolean addSorteo (LocalDate fecha, Combinacion combinacion) {
		/*falta el formato fecha*/
		boolean sorteoOK = false;
		
		if(fecha != null && !fecha.isBefore(LocalDate.now()) && combinacion != null ) {
			sorteos.put(fecha, combinacion);
			sorteoOK = true;
		}else {
			sorteoOK = false;
		}
		
		return sorteoOK;
		
	}
	
	
	public boolean addSorteo (int num1, int num2, int num3, Combinacion combinacion) {
		boolean rdo = false;
		
		LocalDate fecha = null;
		
		if(num1 >=1 && num1<=31) {
			fecha.withDayOfMonth(num1);
			
		}else if(num2 >=1 && num2 <= 12) {
			fecha.withMonth(num2);
		}else {
			fecha.withYear(num3);
			
		}
		sorteos.put(fecha, combinacion);
		rdo = true;
		return rdo;
	}
		
	public boolean actualizarSorteo (int num1, int num2, int num3, Combinacion combinacion) {
			boolean sorteoOK = false;
		
				LocalDate fecha = null;
				
				if(num1 >=1 && num1<=31) {
					fecha.withDayOfMonth(num1);
					
				}else if(num2 >=1 && num2 <= 12) {
					fecha.withMonth(num2);
				}else {
					fecha.withYear(num3);
				}
				sorteos.put(fecha, combinacion);
				sorteoOK = true;
		
		return sorteoOK;
	}
	
	public boolean actualizarSorteo (LocalDate fecha, Combinacion combinacion) {
		boolean sorteoOK = false;
		
		if(fecha != null && !fecha.isBefore(LocalDate.now()) && combinacion != null) {
			sorteos.put(fecha, combinacion);
			sorteoOK = true;
		}
		return sorteoOK; 
	}
	
	public boolean borrarSorteo (LocalDate fecha) {
		boolean borrado = false;
		
		if(sorteos.containsKey(fecha)) {
			sorteos.remove(fecha);
			borrado = true;
		}
		
		
		return borrado;
	}
	
	public List listarSorteoDesdeFecha (LocalDate fecha) {
		/*Falta desde fecha*/
		
		Set <Map.Entry <LocalDate, Combinacion>> mapaSorteos = sorteos.entrySet();
		
		List <Map.Entry<LocalDate, Combinacion>> listaSorteos = new ArrayList<>(mapaSorteos);
		
		return listaSorteos;
	}
	
	public List mostrarHistorico () {
		
		Set <Map.Entry <LocalDate, Combinacion>> histSorteos = sorteos.entrySet();
		List <Map.Entry<LocalDate, Combinacion>> historico = new ArrayList<>(histSorteos);
		return historico;
	}
	
	public Map comprobarAciertos (LocalDate fecha, Combinacion combinacion) {
		
		
		
		return "";
	}
}



		
		
		
	
