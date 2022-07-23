package mecanica;

import java.lang.Math;
import auto.Auto;

public class ReparaAceleracion extends ReparadorAverias {

	public ReparaAceleracion(Reparador wrapee) {
		super(wrapee);
	}
	
	@Override
	public void repararAveria(Auto auto) {
				
		System.out.println("Revisando motor");
		System.out.println("Obteniendo porencia del motor");
		int potencia = auto.getMotor().getPotencia();
		
		System.out.println("Ajustando potencia del motor");
		int nueva_potencia = (int) Math.round(0.90 * potencia);
		auto.getMotor().setPotencia(nueva_potencia);
		
		System.out.println("Problemas de sobre aceleracion reparados");
		
		auto.setTotalAverias(auto.getTotalAverias()-1);
		super.repararAveria(auto);
		
	}

}
