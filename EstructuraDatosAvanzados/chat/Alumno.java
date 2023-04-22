package chat;

import java.time.LocalDateTime;

public class Alumno extends Persona {

	public Alumno(String dni, String nombre, String apellidos, int edad, String sexo) {
		super(dni, nombre, apellidos, edad, sexo);
		
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) throws Exception {
		
		if(texto!= null && destinatario instanceof Profesor && edad>=18) {
			Mensaje ms = new Mensaje(this, texto, LocalDateTime.now());
			destinatario.buzon.add(ms);
		}else {
			throw new Exception ("El mensaje no puede ser enviado a otro alumno");
		}
	}
	
}
