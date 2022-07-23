package auto;

public class TodoTerreno extends Auto {
	
	private boolean traccion4WD ;
	
	

	public TodoTerreno() {
		super();
	}

	public boolean isTraccion4WD() {
		return traccion4WD;
	}

	public void setTraccion4WD(boolean traccion4wd) {
		traccion4WD = traccion4wd;
	}

	@Override
	public String toString() {
		return "TodoTerreno [traccion4WD=" + traccion4WD + " " + super.toString() + "]";
	}

	
	
	
	
	
	
	

}
