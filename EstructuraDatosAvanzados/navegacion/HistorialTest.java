package navegacion;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class HistorialTest {

	Historial nuevoHistorial = new Historial();
	Web nuevaWeb = new Web("google", LocalDateTime.now());
	Web nuevaWeb2 = new Web("marca", LocalDateTime.now().plusHours(1));
	
	
	
	@Test
	void testAgregarWeb() {
	/*	assertThrows(HistorialException.class , nuevoHistorial.agregarWeb(nuevaWeb));*/
	}
	
	@Test
	void testAgregarWebOtra() {
		
		nuevoHistorial.agregarWeb(nuevaWeb);
		nuevoHistorial.agregarWeb(nuevaWeb2);
	}

	@Test
	void testConsultarHistorialcompleto() {
		nuevoHistorial.agregarWeb(nuevaWeb);
		nuevoHistorial.agregarWeb(nuevaWeb2);
		nuevoHistorial.consultarHistorialcompleto();
	}

	@Test
	void testConsultarHistoDia() {
		nuevoHistorial.agregarWeb(nuevaWeb);
		nuevoHistorial.agregarWeb(nuevaWeb2);
		nuevoHistorial.consultarHistoDia(LocalDateTime.now());
	}
	
	

	@Test
	void testBorrarHistorial() {
		nuevoHistorial.agregarWeb(nuevaWeb);
		nuevoHistorial.agregarWeb(nuevaWeb2);
		nuevoHistorial.borrarHistorial();
		}

	@Test
	void testBorrarVisita() {
		nuevoHistorial.agregarWeb(nuevaWeb);
		nuevoHistorial.agregarWeb(nuevaWeb2);
		nuevoHistorial.borrarVisita(nuevaWeb);
	}

}
