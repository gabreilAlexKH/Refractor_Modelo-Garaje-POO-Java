package mecanica;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import auto.Auto;

public class Garaje {

    private Map<Auto, Reparador> autosAveriados ;
    private int capacidad;
    
    

    public Garaje(int capacidad) {
		super();
		this.capacidad = capacidad;
		autosAveriados = new HashMap<Auto, Reparador>();
	}
    
    private Reparador equiparMecanico( ArrayList<Averia> averias){
    	
    	Reparador reparador = new Mecanico();
    	
    	if(averias.contains(Averia.ACEITE)) {	
    		reparador = new ReparaAceite(reparador);
    		
    	}if(averias.contains(Averia.SOBRE_ACELERACION)) {
        	reparador = new ReparaAceleracion(reparador);

    		
    	}if(averias.contains(Averia.ABOLLADURA)) {	
    		reparador = new ReparaAbolladura(reparador);	
    	}
    	
    	return reparador;
    	
    	
    }

	public boolean addAuto(Auto auto, ArrayList<Averia> averias) {
		
        int nAutos = autosAveriados.size();
        Reparador reparador = null;
        
        if (nAutos + 1 <= capacidad) {
        	
        	reparador = equiparMecanico(averias);
        	auto.agregarAverias(averias.size());
        	autosAveriados.put(auto, reparador);        	
        	return true;
        
        	
        } else {
            return false;
        }
    }

    public void removeAuto(Auto auto) {
    	
    	autosAveriados.remove(auto);
    }
    
    public void repararAutos() {
    	
    	Iterator<Auto> it = autosAveriados.keySet().iterator();
    	while(it.hasNext()){
    		
    		Auto auto = it.next();
    		Reparador reparador = autosAveriados.get(auto);
    		
    		System.out.println("\nReparando auto marca " + auto.getMarca() + " y modelo " + auto.getModelo());
    		reparador.repararAveria(auto);
    		
    	}
    	
    	autosAveriados.clear();
    }
}