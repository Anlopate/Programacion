package ejercicio3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipo <T>{

	private String nombreEquipo;
	private Set <T> conjuntoAlumnos;

	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.conjuntoAlumnos = new HashSet<>();
	}

	public boolean pertenece(T alumno) {
		boolean respuesta = false;

		if (conjuntoAlumnos.contains(alumno)) {
			respuesta = true;
		} else {
			respuesta = false;
		}

		return respuesta;
	}

	public void agregarAlumno(T alumno) throws Exception {

		if (!pertenece(alumno)) {
			conjuntoAlumnos.add(alumno);
		} else {
			throw new Exception("El alumno ya pertenece al equipo");
		}

	}

	public void borrarAlumno(T alumno) throws Exception {

		if (pertenece(alumno)) {
			conjuntoAlumnos.remove(alumno);
		} else {
			throw new Exception("El alumno no está en el equipo. No se puede borrar.");
		}

	}

	public void alumnoEsta(T alumno) {
	}
	
	public void personasEquipo() {
		
		for(T personas : conjuntoAlumnos) {
			
			System.out.println(personas);
		}
		
	}
	
	public Equipo union (Equipo other) {
		
		boolean nuevoEquipo = this.conjuntoAlumnos.addAll(other.conjuntoAlumnos);
		
		return this;
	}
		
		
		
	public Equipo interseccion (Equipo other) {
		
		boolean nuevoEquipo = this.conjuntoAlumnos.retainAll(other.conjuntoAlumnos);
		
		return this;

		
	}
	
	public String mostrarAlumnos () {
		
		StringBuilder sb = new StringBuilder();
		
		for (T a : conjuntoAlumnos) {
			sb.append(a);
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return String.format("Equipo: %s \n" 
							+ "Formado por: \n" 
							+ "%s",
							this.nombreEquipo, 
							this.conjuntoAlumnos);
	}
		
	
	
	

}
		
		
		 
		

