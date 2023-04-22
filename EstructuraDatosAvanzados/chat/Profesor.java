package chat;

import java.time.LocalDateTime;

public class Profesor extends Persona {

	public Profesor(String dni, String nombre, String apellidos, int edad, String sexo) {
		super(dni, nombre, apellidos, edad, sexo);
		
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) {
		
		if(texto!=null && destinatario!=null) {
			Mensaje ms = new Mensaje(this, texto, LocalDateTime.now());
			destinatario.buzon.add(ms);
		}
	}

	
}
