package auto_constructores;

import auto.Auto;
import auto.Motor;

public class SUVConstructor implements AutoConstructor {

	private Auto auto; 

	@Override
	public void reset() {
		auto = new Auto();
		
	}

	@Override
	public void setEjes() {
		auto.setCantidadEjes(2);
		//Agregar eje de accionamiento
		//Agregar llantas 
		//Inflar llantas
		
	}

	@Override
	public void setMotor() {
		Motor motor = new Motor(180 , 45);
		auto.setMotor(motor);//Instalar motor
		//Instalar trasmicion
		//Conectar trasmicion a eje de accionamiento	
	}

	@Override
	public void setAceite() {
		auto.getMotor().setLitros_de_aceite(auto.getMotor().getCapacidad_aceite());
		//Esparcir aceite por el SUV
		//Lubricar interior
		
	}
	
	public Auto getResult() {
		return auto;
	}

}
