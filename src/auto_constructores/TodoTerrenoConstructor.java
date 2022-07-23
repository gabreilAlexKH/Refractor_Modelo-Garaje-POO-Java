package auto_constructores;

import auto.Motor;
import auto.TodoTerreno;

public class TodoTerrenoConstructor implements AutoConstructor {

	private TodoTerreno auto; 


	@Override
	public void reset() {
		auto = new TodoTerreno();
		
	}

	@Override
	public void setEjes() {
		auto.setCantidadEjes(3);
		//Agregar eje de accionamiento
		auto.setTraccion4WD(true); //Incorporando 4WD
		//Agregar llantas 
		//Inflar llantas
		
	}

	@Override
	public void setMotor() {
		Motor motor = new Motor(230 , 50);
		auto.setMotor(motor);//Instalar motor
		//Instalar trasmicion
		//Conectar trasmicion a eje de accionamiento
		
	}

	@Override
	public void setAceite() {
		auto.getMotor().setLitros_de_aceite(auto.getMotor().getCapacidad_aceite());
		//Esparcir aceite por el TodoTerreno
		//Lubricar interior
		
	}
	
	public TodoTerreno getResult() {
		return auto;
	}

}
