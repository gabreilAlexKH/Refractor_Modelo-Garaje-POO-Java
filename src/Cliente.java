import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

import auto.Auto;
import auto.Camion;
import auto.Motor;
import auto.TodoTerreno;
import auto_constructores.AutoDirector;
import auto_constructores.CamionConstructor;
import auto_constructores.SUVConstructor;
import auto_constructores.TodoTerrenoConstructor;
import mecanica.Averia;
import mecanica.Garaje;

public class Cliente {
    public static void main(String[] args) {
    	
    	//-------Fabricasion de autos-------
    	CamionConstructor conCamiones = new CamionConstructor();
    	SUVConstructor conSUV = new SUVConstructor();
    	TodoTerrenoConstructor conTodoTerreno = new TodoTerrenoConstructor();

    	AutoDirector director = new AutoDirector( conCamiones);
    	director.crearAuto();
        Camion elToreto = conCamiones.getResult();
        elToreto.setMarca_Modelo("Mercedes", "D85");
        
        director.setConstructor(conSUV);
        director.crearAuto();
        Auto jefe = conSUV.getResult();
        jefe.setMarca_Modelo("Great Wall", "M4");

        
        director.setConstructor(conTodoTerreno);
        director.crearAuto();
        TodoTerreno aventurero = conTodoTerreno.getResult();
        aventurero.setMarca_Modelo("Chebrotele", "Vitara");		
        
        System.out.println("Autos construidos:\n" + 
                elToreto.toString() + "\n" + 
                		jefe.toString() + "\n" +
                		aventurero.toString() + "\n");
        
        
        //-------Funcionamiento de Mecanica/Garaje-------
        Garaje joseCarros = new Garaje(10);

        //Ingresar autos averiados a la mecaniva
        ArrayList<Averia> averias = new ArrayList<Averia>();
        Collections.addAll(averias, new Averia[] {Averia.ACEITE, Averia.ABOLLADURA , Averia.SOBRE_ACELERACION});
        joseCarros.addAuto(aventurero, averias);
        
        ArrayList<Averia> averias2 = new ArrayList<Averia>();
        Collections.addAll(averias2, new Averia[] {Averia.ACEITE});
        joseCarros.addAuto(jefe, averias2);
        
        ArrayList<Averia> averias3 = new ArrayList<Averia>();
        Collections.addAll(averias3, new Averia[] {Averia.ABOLLADURA , Averia.SOBRE_ACELERACION});
        joseCarros.addAuto(elToreto, averias);
        
        //Reaparar autos
        joseCarros.repararAutos();
        
        System.out.println("Reultados de reparacion:\n" + 
        elToreto.toString() + "\n" + 
        		jefe.toString() + "\n" +
        		aventurero.toString() + "\n");
        
    }
}
