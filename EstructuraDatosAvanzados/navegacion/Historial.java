package navegacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {
	
	private List <Web> historial;

	public Historial() {
		super();
		this.historial = new ArrayList();
	}
	
	public void agregarWeb (Web nuevaWeb) {
		
		if(nuevaWeb!=null && historial.isEmpty()) {
			historial.add(nuevaWeb);
		}else {
			
		Web ultimaPosicion = historial.get(historial.size()-1);
		
		if(ultimaPosicion.getVisita().isBefore(nuevaWeb.getVisita())){
			historial.add(nuevaWeb);
		}
		}
		
	}
			
	public String consultarHistorialcompleto () {
		
		StringBuilder sb = new StringBuilder();
		
		for(Web w : historial) {
			sb.append(w + "\n");
		}
		return sb.toString();
	}
			
			
	public 	String consultarHistoDia (LocalDateTime fecha) {
		
			StringBuilder sb = new StringBuilder();
		/*w.getVisita().equals(fecha);*/
				for(Web w : historial) {
					if(w.getVisita().getDayOfYear() == fecha.getDayOfYear()) {
						sb.append(w);
				}
			
				}
				return sb.toString();
			}
		
	public void borrarHistorial () {
		historial.clear();
	}
		
	public void borrarVisita (Web pagina) {
		historial.remove(pagina);
		
	}
}
		
	
	

		
		



