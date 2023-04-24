package euromillonMock;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public  class Combinacion {

	protected static final int VALOR_MINIMO = 1;
	protected static final int VALOR_MAXIMO_NUM = 50;
	protected static final int VALOR_MAXIMO_ESTRELLAS = 12;
	protected static final int TOTAL_NUMEROS = 5;
	protected static final int TOTAL_ESTRELLAS = 2;

	private Set<Integer> numeros;
	private Set<Integer> estrellas;

	public Combinacion(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		
		super();
		this.numeros = new HashSet<>();
		this.estrellas = new HashSet<>();
		int[] numeros = new int[] { num1, num2, num3, num4, num5 };
		int[] estrellas = new int[] { num6, num7 };

		for (Integer i : numeros) {
			if (i > 0 && i >= VALOR_MINIMO && i <= VALOR_MAXIMO_NUM && numeros.length <= TOTAL_NUMEROS) {
				this.numeros.add(i);
			}

		}

		for (Integer e : estrellas) {
			if (e > 0 && e >= VALOR_MINIMO && e <= VALOR_MAXIMO_ESTRELLAS && estrellas.length <= TOTAL_NUMEROS) {
				this.estrellas.add(e);
			}
		}

	}

	public Combinacion(int[] numeros, int[] estrellas) {
			this(numeros[0],numeros[1],numeros[2],numeros[3],numeros[4],estrellas[0],estrellas[1]);
	}
		

	public Set<Integer> getNumeros() {
		return numeros;
	}

	public Set<Integer> getEstrellas() {
		return estrellas;
	}

	/*public int comprobarCombinacion(Combinacion combi) {

		Set<Integer> aciertos = new HashSet<>();

		aciertos.addAll(numeros);
		aciertos.addAll(estrellas);
		aciertos.retainAll(combi.numeros);
		aciertos.retainAll(combi.estrellas);

		return aciertos.size();
	}*/
	
	public int comprobarCombinacion(Combinacion numero) {
        int aciertos = 0;
        for(Integer n:this.numeros) {
            if(numero.numeros.contains(n)) {
                aciertos++;
            }
        for(Integer e:this.estrellas) {
            if(numero.estrellas.contains(e)) {
                aciertos++;
            }
        }
	}
        return aciertos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}

	@Override
	public boolean equals(Object obj) {

		boolean iguales = this == obj;

		if (obj != null && !iguales && (obj instanceof Combinacion other)) {
			iguales = this.estrellas.equals(other.estrellas) && Objects.equals(numeros, other.numeros);
		}
		return iguales;

	}

	@Override
	public String toString() {
		return String.format("La combiación es: %s \n" + "Con las estrellas: %s \n", this.numeros, this.estrellas);
	}

}
