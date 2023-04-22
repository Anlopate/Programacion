package chat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mensaje {

	private Persona remitente;
	private String texto;
	private LocalDateTime fechaHoraEnvio;
	private  int mnsNum;
	
	
	public Mensaje(Persona remitente, String texto, LocalDateTime fechaHora) {
		super();
		this.remitente = remitente;
		this.texto = texto;
		this.fechaHoraEnvio = fechaHora;
		this.mnsNum = mnsNum++;
	}

	
	public Mensaje(String string, String texto2, LocalDate now) {
		
	}


	


	public Mensaje(String string, String texto2, LocalDateTime now) {
		// TODO Auto-generated constructor stub
	}


	public Persona getRemitente() {
		return remitente;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public LocalDateTime getFechaHoraEnvio() {
		return fechaHoraEnvio;
	}
	
	
	
	public int getMnsNum() {
		return mnsNum;
	}


	@Override
	public String toString() {
		return String.format("\nMensaje %s: \n"
				+ "De: %s \n"
				+ "Texto: %s \n"
				+ "Fecha y hora: %s \n",
				this.mnsNum,
				this.remitente,
				this.texto,
				this.fechaHoraEnvio);
		
	}
	
	
	
}
	














