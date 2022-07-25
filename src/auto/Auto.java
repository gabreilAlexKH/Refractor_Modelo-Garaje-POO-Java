package auto;


public class Auto {
	public Motor motor;
	private String marca;
	private String modelo;
	double totalAverias;
	public int cantidadEjes;

	public Auto() {
		
	}


	public double getTotalAverias() {
		return totalAverias;
	}

	public void setTotalAverias(double totalAverias) {
		this.totalAverias = totalAverias;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	

	public Motor getMotor() {
		return motor;
	}

	public void setMarca_Modelo(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
	}

	public void setCantidadEjes(int cantidadEjes) {
		this.cantidadEjes = cantidadEjes;
	}

	public void agregarAverias(double n_averias) {
		this.totalAverias += n_averias;
	}


	@Override
	public String toString() {
		return "Auto: marca=" + marca + ", modelo=" + modelo + ", motor=" + motor 
				+ ", cantidadEjes=" + cantidadEjes + ", totalAverias=" + totalAverias ;
	}
	
	

}