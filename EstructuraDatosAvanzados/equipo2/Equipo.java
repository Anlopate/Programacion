package equipo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipo extends ComparatorEdad {

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
		this.conjuntoAlumnos =new HashSet<>();
	}

	public Equipo () {
		this.nombreEquipo = nombreEquipo;
		this.conjuntoAlumnos = new HashSet<>();
		
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

		for (Alumno personas : conjuntoAlumnos) {
			sb.append(personas + "\n");

		}
		return sb.toString();
	}

	public Equipo union(Equipo other) {

		Equipo nuevoEquipo = new Equipo("nombre", other.conjuntoAlumnos);
		nuevoEquipo.conjuntoAlumnos.addAll(other.conjuntoAlumnos);

		return nuevoEquipo;
	}

	public String masculinoOrdenEdad() {

		StringBuilder sb = new StringBuilder();
		List<Alumno> listaAlumnos = new ArrayList(conjuntoAlumnos);

		for (Alumno p : listaAlumnos) {
			if (p.getSexo() == 'H' && p.getEdad() > 18) {
				sb.append(p);
			}
		}
		Collections.sort(listaAlumnos, new ComparatorEdad());

		return sb.toString();
	}

	public boolean esFemenino() {
		boolean esFemenino = false;

		StringBuilder sb = new StringBuilder();

		for (Alumno f : conjuntoAlumnos) {
			if (f.getSexo() == 'M') {
				sb.append(f);

			}
			if (sb.length() == conjuntoAlumnos.size()) {
				esFemenino = true;
			}

		}
		return esFemenino;
	}

	public int jugadorasMayoresEdad() {
		StringBuilder sb = new StringBuilder();

		for (Alumno f : conjuntoAlumnos) {
			if (f.getSexo() == 'M' && f.getEdad() >= 18) {
				sb.append(f);
			}
		}
		return sb.length();

	}

	public Equipo interseccion(Equipo other) {

		Equipo interEquipo = new Equipo("nombre", other.conjuntoAlumnos);

		interEquipo.conjuntoAlumnos.retainAll(other.conjuntoAlumnos);

		return this;

	}

	public int edadMayorJugadoras() {

		StringBuilder sb = new StringBuilder();
		List <Integer> edades = new ArrayList<>();

		for (Alumno f : conjuntoAlumnos) {
			if (f.getSexo() == 'M' && f.getEdad() >= 18) {
				edades.add(f.getEdad());
			}
		}
		edades.sort(new ComparadorEdadesInteger());
		
		return edades.get(0);
		
	}
	
	public Set dniMenores() {
		
		Set <String> dni = new HashSet<>();
		
		for(Alumno d : conjuntoAlumnos) {
			if(d.getSexo() == 'H' && d.getEdad()<18) {
			dni.add(d.getDni());
		}
		}
		return dni;
	}
	
	public List nombreJugadoras () {
		
		List <String> nombres = new ArrayList();
		
		for(Alumno n : conjuntoAlumnos) {
			if(n.getSexo() == 'M') {
				nombres.add(n.getNombre());
			}
		}
		Collections.sort(nombres);
		return nombres;
	}
	
	public boolean jugadoraMayor () {
		boolean hayMayor = false;
		
		for(Alumno j : conjuntoAlumnos) {
			if(j.getEdad()>18 && j.getSexo()=='M') {
				hayMayor = true;
			}
		}
		
		return hayMayor;
	}
	
	public int ciudadesDiferentes () {
		
		Set <String> ciudades = new HashSet<>();
	
		for(Alumno c : conjuntoAlumnos) {
			ciudades.add(c.getCiudad());
		}
		 return ciudades.size()	;
		
	}
	
	@Override
	public String toString() {
		return String.format("Equipo: %s \n" + "Formado por: \n" + "%s", this.nombreEquipo, this.conjuntoAlumnos);
	}

}
