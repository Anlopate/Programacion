package diccionario;

import java.util.ArrayList;
import java.util.List;

public class Significado {

	protected List <String> significado;

	public Significado(String significado) {
		super();
		this.significado =  new ArrayList<>();
		addSignificado(significado);
		
	}

	public List<String> getSignificado() {
		return significado;
	}

	public void setSignificado(List<String> significado) {
		this.significado = significado;
	}
	
	public void addSignificado (String significado) {
		
		this.significado.add(significado);
		
	}

	@Override
	public String toString() {
		return String.format("Significado : %s",  this.significado);
	}
	
	
}
