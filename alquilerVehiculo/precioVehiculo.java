package alquilerVehiculo;

public enum precioVehiculo {
	
	PRECIOBAJA (30),
	PRECIOMEDIA (40),
	PRECIOALTA (50);
	
	private double precio;

	precioVehiculo(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}

}
