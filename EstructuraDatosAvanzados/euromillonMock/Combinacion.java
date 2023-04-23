package euromillonMock;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Combinacion {
	
	protected static final int VALOR_MINIMO = 1;
	protected static final int VALOR_MAXIMO_NUM = 50;
	protected static final int VALOR_MAXIMO_ESTRELLAS = 12;
	protected static final int TOTAL_NUMEROS = 5;
	protected static final int TOTAL_ESTRELLAS = 2;
	
	private Collection <Integer> numeros;
	private Collection <Integer> estrellas;
	
	
	public Combinacion(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		
		int [] numeros = new int [] {num1, num2, num3, num4, num5};
		int [] estrellas = new int [] {num6, num7};
	}
		
	public Combinacion(int[] numeros, int[]estrellas) throws CombinacionException {
		super();
		this.numeros = new HashSet<>();
		this.estrellas = new HashSet<>();
		
		for (Integer i : numeros) {
			if(i > 0 && i >= VALOR_MINIMO && i <= VALOR_MAXIMO_NUM && numeros.length <= TOTAL_NUMEROS) {
				this.numeros.add(i);
			}else {
				throw new CombinacionException("Ese número ya existe.Introduzca otro.");
			}
		}
		
		for (Integer e : estrellas) {
			if(e > 0 && e >= VALOR_MINIMO && e <= VALOR_MAXIMO_ESTRELLAS && estrellas.length <= TOTAL_NUMEROS) {
				this.numeros.add(e);
			}else {
				throw new CombinacionException("Ese número ya existe.Introduzca otro.");
			}
		}
		
		
		
	}
	
	public Collection<Integer> getNumeros() {
		return numeros;
	}
	
	
	public Collection<Integer> getEstrellas() {
		return estrellas;
	}
	
	public int comprobarCombinacion (Combinacion combi) {
		/*No sé a qué se refiere*/
			
		return 1;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		/*Por qué error?*/
		boolean iguales = this == obj;
		
		if (obj != null && !iguales && (obj instanceof Combinacion)) {
			Object other = (Combinacion) obj;
			iguales = this.estrellas.equals(other.estrellas) && Objects.equals(numeros, other.numeros);
		}
		return iguales;
		
	}
	@Override
	public String toString() {
		return String.format("La combiación es: %s \n"	
						   + "Con las estrellas: %s \n",
								this.numeros,
								this.estrellas);
	}
	
	
	
	
	
}



		
		
		
		
		
		
		
	
	






