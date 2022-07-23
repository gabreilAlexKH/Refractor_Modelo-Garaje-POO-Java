package mecanica;

import auto.Auto;

public class ReparaAceite extends ReparadorAverias {

	public ReparaAceite(Reparador wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void repararAveria(Auto auto) {
		
		int litrosAceite = auto.getMotor().getCapacidad_aceite();
		
		System.out.println("Vaciando aceite");
		auto.getMotor().setLitros_de_aceite(0);
		System.out.println("Cambinado filtro de aceite");
		System.out.println("Ingresando nuevo aceite");
		auto.getMotor().setLitros_de_aceite(litrosAceite);
		System.out.println("Cambio de aceite completado");
		
		auto.setTotalAverias(auto.getTotalAverias()-1);
		super.repararAveria(auto);
		
	}

}
