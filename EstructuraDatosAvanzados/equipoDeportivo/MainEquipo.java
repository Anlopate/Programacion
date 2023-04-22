package equipoDeportivo;

public class MainEquipo {
	
	public static void main(String[] args) {
		
		Alumno pepe = new Alumno ("pepe" , "45781263L");
		Alumno paco = new Alumno ("paco" , "45787459A");
		Alumno ana = new Alumno ("ana" , "21631263k");
		Alumno rosita = new Alumno ("rosita" , "1236563P");
		Alumno paquito = new Alumno ("paquito" , "367859563S");
		Alumno josemi = new Alumno ("josemi" , "9632563M");
		Alumno miguel = new Alumno ("miguel" , "1236563W");
		Alumno patricia = new Alumno ("patricia" , "25361478T");
		
		Equipo cadiz = new Equipo ("CadizCF");
		Equipo betis = new Equipo ("Betis");
		
		
		
		/*Añadir alumnos al equipo Cádiz*/
		try {
			cadiz.agregarAlumno(rosita);
			cadiz.agregarAlumno(ana);
			cadiz.agregarAlumno(paco);
			cadiz.agregarAlumno(pepe);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*Añadir alumnos al equipo Betis*/
		
		try {
			betis.agregarAlumno(patricia);
			betis.agregarAlumno(miguel);
			betis.agregarAlumno(paquito);
			betis.agregarAlumno(josemi);
			betis.agregarAlumno(rosita);
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		
		/*Quitar alumnos del equipo*/
		try {
			cadiz.borrarAlumno(paco);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		/*Un alumno pertenece al equipo?*/
		System.out.println(cadiz.pertenece(rosita));
		
		/*Mostrar alumnos del equipo*/
		System.out.println(cadiz.personasEquipo());
		
		/*Mostrar nuevo equipo formado por la unión de los dos equipos*/
		
		System.out.println(cadiz.union(betis));
		
		/*Mostrar los alumnos que juegan en los dos equipos*/
		
		System.out.println(cadiz.interseccion(betis));
	}
	

		
}
