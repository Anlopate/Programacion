package equipoDeportivo;

import java.util.HashSet;
import java.util.Set;

public class Equipo {

	private String nombreEquipo;
	private Set<Alumno> conjuntoAlumnos;

	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.conjuntoAlumnos = new HashSet<>();
	}
	
	public Equipo(String nombreEquipo, Set<Alumno> equipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.conjuntoAlumnos = equipo;
	}


	public boolean pertenece(Alumno alumno) {
		boolean respuesta = false;

		if (conjuntoAlumnos.contains(alumno)) {
			respuesta = true;
		} else {
			respuesta = false;
		}

		return respuesta;
	}

	public void agregarAlumno(Alumno alumno) throws Exception {

		if (alumno != null && !pertenece(alumno)) {
			conjuntoAlumnos.add(alumno);
		} else {
			throw new Exception("El alumno ya pertenece al equipo");
		}

	}

	public void borrarAlumno(Alumno alumno) throws Exception {

		if (pertenece(alumno)) {
			conjuntoAlumnos.remove(alumno);
		} else {
			throw new Exception("El alumno no está en el equipo. No se puede borrar.");
		}

	}


	
	public String personasEquipo() {
		StringBuilder sb = new StringBuilder();
		
		for(Alumno personas : conjuntoAlumnos) {
			sb.append(personas + "\n");
			
		}
		return sb.toString();
	}
	
	public Equipo union (Equipo other) {
		
		Equipo nuevoEquipo = new Equipo ("nombre", other.conjuntoAlumnos);
		nuevoEquipo.conjuntoAlumnos.addAll(other.conjuntoAlumnos);
		
		return nuevoEquipo;
	}
		
		
		
		
		
	public Equipo interseccion (Equipo other) {
		
		Equipo interEquipo = new Equipo ("nombre", other.conjuntoAlumnos);
		
		interEquipo.conjuntoAlumnos.retainAll(other.conjuntoAlumnos);
		
		return this;

		
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
		
		
		 
		

