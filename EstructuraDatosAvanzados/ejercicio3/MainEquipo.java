package ejercicio3;

public class MainEquipo {
	
	public static void main(String[] args) {
		
		
		Equipo cadiz = new Equipo ("CadizCF");
		Equipo betis = new Equipo ("Betis");
		
		
		
		/*Añadir alumnos al equipo Cádiz*/
		try {
			cadiz.agregarAlumno(Integer.valueOf(1));
			cadiz.agregarAlumno(Double.valueOf(2.5));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*Añadir alumnos al equipo Betis*/
		
	
		/*Un alumno pertenece al equipo?*/
		
		
		/*Mostrar alumnos del equipo*/
		System.out.println(cadiz.mostrarAlumnos());
		
		/*Mostrar nuevo equipo formado por la unión de los dos equipos*/
		
		System.out.println(cadiz.union(betis));
		
		/*Mostrar los alumnos que juegan en los dos equipos*/
		
		System.out.println(cadiz.interseccion(betis));
	}
	
	

		
}
