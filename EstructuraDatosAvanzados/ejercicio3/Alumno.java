package ejercicio3;

import java.util.Objects;

public class Alumno {
	
	private String nombre;
	private String dni;
	
	
	public Alumno (String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	
	@Override
	public String toString() {
		return String.format("El/la alumno/a %s con dni %s \n",
							this.nombre,
							this.dni);
					  
						   	
	}


	@Override
	public boolean equals(Object obj) {
		boolean iguales = this == obj;
		
		if (obj != null && !iguales &&(obj instanceof Alumno other)) {
			iguales =  this.dni.equals(other.dni) && this.nombre.equals(other.nombre);
			
		}
		return iguales;
	}
	
	
	

}

