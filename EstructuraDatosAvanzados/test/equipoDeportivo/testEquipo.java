package test.equipoDeportivo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import equipoDeportivo.Alumno;
import equipoDeportivo.Equipo;


class testEquipo {
	
	Equipo nuevo = new Equipo("nuevo");
	Equipo nuevo2 = new Equipo("nuevo2");
	Alumno alu1 = new Alumno("Ana", "123456");
	Alumno alu2 = new Alumno("Josemi", "789456");
	Set<Alumno> alumnos = new HashSet<>();
	Alumno alu3 = new Alumno("JM", "213213");
	Equipo nuevo3 = new Equipo("nuevo3", alumnos);


	@Test
	void testPerteneceOK() {
		try {
			alumnos.add(alu1);
			assertTrue(nuevo3.pertenece(alu1));
		} catch (Exception e) {
		}
	
	}
	
	@Test
	void testPerteneceKO() {
		try {
			
			
			assertFalse(nuevo3.pertenece(alu2));
		} catch (Exception e) {
		}
	}
	
	

	@Test
	void testAgregarAlumnoOK() {
		try {
			nuevo.agregarAlumno(alu1);
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	void testAgregarAlumnoKODup() {
		try {
			nuevo.agregarAlumno(alu1);
			nuevo.agregarAlumno(alu1);
		} catch (Exception e) {
			assert(true);
		}
	}
	
	@Test
	void testAgregarAlumnoKO() {
		try {
			nuevo.agregarAlumno(null);
		} catch (Exception e) {
			assert(true);
		}
	}

	@Test
	void testBorrarAlumnoOK() {
		try {
			nuevo.agregarAlumno(alu1);
			nuevo.borrarAlumno(alu1);
		} catch (Exception e) {
			assert(false);
		}
	}

	@Test
	void testBorrarAlumnoKO() {
		try {
			
			nuevo.borrarAlumno(alu1);
		} catch (Exception e) {
			assert(true);
		}
	}


	@Test
	void testPersonasEquipoOK() {
		try {
			nuevo.agregarAlumno(alu1);
			assertEquals("El/la alumno/a Ana con dni 123456"+"\n", nuevo.personasEquipo());
		} catch (Exception e) {
			
			
		}
		
	}
	
	@Test
	void testPersonasEquipoKO() {
		try {
			nuevo.agregarAlumno(alu1);
			assertNotEquals("El/la alumno/a Ana con dni 123123"+"\n", nuevo.personasEquipo());
		} catch (Exception e) {
			
			
		}
		
	}

	@Test
	void testUnion() {
		try {
			nuevo.agregarAlumno(alu1);
			nuevo2.agregarAlumno(alu2);
			assertEquals(nuevo, nuevo.union(nuevo2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testInterseccion() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarAlumnos() {
		fail("Not yet implemented");
	}

}
