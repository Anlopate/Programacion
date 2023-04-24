package euromillonMock;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Historial {

	
	private Map <LocalDate, Combinacion> sorteos;
	

	public Historial() {
		super();
		this.sorteos = new HashMap<>();
	}
	
	public boolean addSorteo (LocalDate fecha, Combinacion combinacion) {
		
		boolean sorteoOK = false;
		
		if(fecha != null && !sorteos.containsKey(fecha) && combinacion != null ) {
			sorteos.put(fecha, combinacion);
			sorteoOK = true;
		}else {
			sorteoOK = false;
		}
		
		return sorteoOK;
		
	}
	
	
	public boolean addSorteo (int dia, int mes, int anio, Combinacion combinacion) {
		
		return addSorteo(LocalDate.of(anio, mes, dia), combinacion);
	}
		
	
	public boolean actualizarSorteo (LocalDate fecha, Combinacion combinacion) {
		boolean sorteoOK = false;
		
		if(fecha != null && sorteos.containsKey(fecha) && combinacion != null) {
			sorteos.put(fecha, combinacion);
			sorteoOK = true;
		}
		return sorteoOK; 
	}
	
	public boolean actualizarSorteo (int dia, int mes, int anio, Combinacion combinacion) {
		return actualizarSorteo(LocalDate.of(anio, mes, dia), combinacion);
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
		/*preguntar si hay que ordenar la lista*/
		
		Set <Map.Entry <LocalDate, Combinacion>> histSorteos = sorteos.entrySet();
		List <Map.Entry<LocalDate, Combinacion>> historico = new ArrayList<>(histSorteos);
		
		return historico;
	}
	
	public Map comprobarAciertos (LocalDate fecha, Combinacion combinacion) throws HistorialException {

		Map<String, Integer> aciertos = new HashMap <>();
		
		
		if(fecha != null && combinacion != null && sorteos.containsKey(fecha)) {
			aciertos.put(fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), sorteos.get(fecha).comprobarCombinacion(combinacion));
			
		}else throw new HistorialException("el sorteo no se ha celebrado");
		
		return aciertos;
	}
	
	
}






		
		
		
	
