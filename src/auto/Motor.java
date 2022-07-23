package auto;

public class Motor {
    private int litros_de_aceite;
    private int potencia;
    private int capacidad_aceite;

    public Motor(int potencia, int capacidad_aceite) {
        this.litros_de_aceite = 0;
        this.potencia = potencia;
        this.capacidad_aceite = capacidad_aceite;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setLitros_de_aceite(int litros_de_aceite) {
        this.litros_de_aceite = litros_de_aceite;
    }

    public int getLitros_de_aceite() {
        return this.litros_de_aceite;
    }

	public int getCapacidad_aceite() {
		return capacidad_aceite;
	}

	public void setCapacidad_aceite(int capacidad_aceite) {
		this.capacidad_aceite = capacidad_aceite;
	}

	@Override
	public String toString() {
		return "Motor [litros_de_aceite=" + litros_de_aceite + ", potencia=" + potencia + ", capacidad_aceite="
				+ capacidad_aceite + "]";
	}
	
	
    
    
}