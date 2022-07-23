package auto_constructores;

import auto.Auto;

public class AutoDirector {
	
	private AutoConstructor constructor;
	
	
	
	public AutoDirector(AutoConstructor constructor) {
		super();
		this.constructor = constructor;
	}

	public void setConstructor(AutoConstructor constructor) {
		this.constructor = constructor;
	}

	public void crearAuto() {
		
		constructor.reset();
		constructor.setEjes();
		constructor.setMotor();
		constructor.setAceite();	
	}

}
