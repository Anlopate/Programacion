package alquilerVehiculo;

public class Furgoneta extends Vehiculo {

	private double PMA;

	public Furgoneta(double pMA) {
		super(matricula);
		PMA = pMA;
	}

	public double getPMA() {
		return PMA;
	}

	public void setPMA(double pMA) {
		PMA = pMA;
	}
	
	

}
