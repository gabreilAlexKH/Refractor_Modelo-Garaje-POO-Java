package mecanica;

import auto.Auto;

public class Mecanico implements Reparador {

	public Mecanico() {
		
	}

	@Override
	public void repararAveria(Auto auto) {
		
		System.out.println("Averias Reparadas\n");
	}
}
