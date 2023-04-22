package navegacion;

import java.time.LocalDateTime;

public class Web {
	
	private String url;
	private LocalDateTime visita;

	
	public Web(String url) {
		super();
		this.url = url;
		this.visita = LocalDateTime.now();
	}
	
	public Web(String url, LocalDateTime fechaHora) {
		super();
		this.url = url;
		this.visita = fechaHora;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public LocalDateTime getVisita() {
		return visita;
	}


	public void setVisita(LocalDateTime visita) {
		this.visita = visita;
	}
	
	
	

}
