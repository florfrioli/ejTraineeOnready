package com.trainee.ejercicio.entidades;

import java.util.ArrayList;
import java.util.Comparator;

public class Concesionaria {
	
	// Carga todos los vehiculos indicados en una única lista
    public static ArrayList <Vehiculo> generarListaDeVehiculos(Vehiculo ... vehiculo){
        ArrayList <Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        for(int i=0; i<vehiculo.length; i++){
            listaVehiculos.add(vehiculo[i]);
        }
        return listaVehiculos;
    }
	
	//Metodo que retorna el vehículo más caro de la lista
    public static Vehiculo vehiculoMasCaro(ArrayList <Vehiculo> lista){
        Vehiculo max = lista.get(0);
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getPrecio() > max.getPrecio()){
                max = lista.get(i);
            }
        }
        return max;
    }
    
    // Metodo que retorna el vehículo más barato de una lista
    public static Vehiculo vehiculoMasBarato(ArrayList <Vehiculo> lista){
        Vehiculo min = lista.get(0);
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getPrecio() < min.getPrecio()){
                min = lista.get(i);
            }
        }
        return min;
    }
    
    //Devuelve el vehiculo que contiene la palabra buscada
    public static Vehiculo vehiculoQueContiene(String palabra, ArrayList <Vehiculo> lista){
    	Vehiculo buscado = null;
    	for(int i = 0; i < lista.size(); i++){
    		if(lista.get(i).getModelo().contains(palabra)){ 
    			buscado = lista.get(i);
    		}            
    	}
    	return buscado;
    }  
    
    // ordenar por precio mayor a menor la lista de vehiculos
    public static void ordenarPorPrecioMayor(ArrayList <Vehiculo> lista) {
    	lista.sort(new Comparator<Vehiculo>() {
    		@Override
    		public int compare(Vehiculo v1, Vehiculo v2) {
				return v2.getPrecio().compareTo(v1.getPrecio());
			}
    	});
    }
    
}
