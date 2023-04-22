package equipo2;

import java.util.Objects;

public class Alumno {
	
	protected String nombre;
	private String dni;
	protected int edad;
	private char sexo;
	private String ciudad;
	
	
	public Alumno (String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Alumno(String nombre, String dni, int edad, char sexo, String ciudad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
		this.ciudad = ciudad;
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return String.format("El/la alumno/a %s con dni %s",
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

