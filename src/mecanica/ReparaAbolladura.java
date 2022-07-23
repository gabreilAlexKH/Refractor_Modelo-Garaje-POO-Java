package mecanica;

import auto.Auto;

public class ReparaAbolladura extends ReparadorAverias {

	public ReparaAbolladura(Reparador wrapee) {
		super(wrapee);
	}
	
	@Override
	public void repararAveria(Auto auto) {
		
		System.out.println("Buscando abolladuras");
		System.out.println("Corriguiendo abolladuras");
		System.out.println("Pulinedo carrocería");
		System.out.println("Abolladuras reparadas");
		
		auto.setTotalAverias(auto.getTotalAverias()-1);
		super.repararAveria(auto);
		
	}

}
