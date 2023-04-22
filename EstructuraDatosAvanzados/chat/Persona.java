package chat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Persona {

	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	protected String sexo;

	protected List<Mensaje> buzon;

	public Persona(String dni, String nombre, String apellidos, int edad, String sexo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;

	}
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
	}

	public abstract void enviarMensaje(Persona destinatario, String texto) throws Exception;

	public String leerMensajes() throws Exception {

		StringBuilder sb = new StringBuilder();

		for (Mensaje i : buzon) {
			if (!buzon.isEmpty()) {
				sb.append(i.toString());

			} else {
				throw new Exception("El buzón está vacío");
			}

		}
		return sb.toString();
	}

	public String leerMnsOrdenado() throws Exception {

		buzon.sort(new CompararMensajes());

		return leerMensajes();
	}

	public void borrarMensaje(int numMns) throws Exception {

		if (buzon.contains(numMns)) {
			buzon.remove(numMns);
		} else {
			throw new Exception("No existe ese número de mensaje");
		}

	}

	public String getNombre() {
		return nombre;
	}

	public String buscarFrase(String frase) throws Exception {

		StringBuilder sb = new StringBuilder();

		for (Mensaje i : buzon) {
			if (i.getTexto().contains(frase)) {
				sb.append(i);

			}else {
				throw new Exception ("No existen mensajes con esa frase.");
			}
		}
		return sb.toString();

	}
}
