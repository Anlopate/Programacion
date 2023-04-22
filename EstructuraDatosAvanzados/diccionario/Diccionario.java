package diccionario;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {

	Map <String, Significado> diccionario;
	
	public Diccionario() {
		super();
		diccionario = new HashMap<>();
	}
	
	public void addPalabra (String palabra, String significado) {
		
		if(diccionario.containsKey(palabra)) {
			diccionario.get(palabra).addSignificado(significado);
			}else {
			diccionario.put(palabra, new Significado(significado));
		}
	}
	
	public String buscaPalabra (String palabra) {
		
		if(diccionario.containsKey(palabra)) {
			diccionario.get(palabra);
		}
		return diccionario.get(palabra).toString();
	}

	public void borrarPalabra (String palabra) {
		if(diccionario.containsKey(palabra)) {
			diccionario.remove(palabra);
		}
	}
	
	public String listarPalabras (String inicioPalabra) {
		
		StringBuilder sb = new StringBuilder();
		
		for (String p : diccionario.keySet()) {
			if(p.startsWith(inicioPalabra)) {
				sb.append(p);
			}
		}
		
		return sb.toString();
	}


}
