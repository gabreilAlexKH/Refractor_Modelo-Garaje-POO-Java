package mecanica;

import auto.Auto;

public abstract class ReparadorAverias implements Reparador {

	private Reparador wrapee;
	
	
	public ReparadorAverias(Reparador wrapee) {
		this.wrapee = wrapee;
	}

	@Override
	public void repararAveria(Auto auto) {
		
		wrapee.repararAveria(auto);
		
	}

}
