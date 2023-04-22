package alquilerVehiculo;

public class Microbus extends Vehiculo {

	private int numPlazas;
	private final int PRECIOPLAZA = 5;

	public Microbus(int numPlazas) {
		super(matricula);
		this.numPlazas = numPlazas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	
	
	
}
