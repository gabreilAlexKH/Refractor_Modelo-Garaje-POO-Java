package auto_constructores;

import auto.Camion;
import auto.Motor;

public class CamionConstructor implements AutoConstructor {

	
	private Camion auto; 
	
	@Override
	public void reset() {
		
		auto = new Camion();
	}

	@Override
	public void setEjes() {
		auto.setCantidadEjes(3);
		//Agregar eje de accionamiento
		//Agregar llantas 
		//Inflar llantas	
	}

	@Override
	public void setMotor() {
		Motor motor = new Motor(500 , 100);
		auto.setMotor(motor);//Instalar motor
		//Instalar trasmicion
		//Conectar trasmicion a eje de accionamiento
	}

	@Override
	public void setAceite() {
		auto.getMotor().setLitros_de_aceite(auto.getMotor().getCapacidad_aceite());
		//Esparcir aceite por el Camion
		//Lubricar interior
	}

	public Camion getResult() {
		return auto;
	}
	
	

}
