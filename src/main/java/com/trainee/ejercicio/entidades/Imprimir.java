package com.trainee.ejercicio.entidades;

import java.util.ArrayList;

public class Imprimir {
	
	// Imprime por pantalla los vehículos más caro y más barato de la lista
	public static void mostrarVehiculosMayorMenor(ArrayList <Vehiculo> vehiculos) {
		System.out.println("Vehículo más caro: " + Concesionaria.vehiculoMasCaro(vehiculos).mostrarMarcaYModelo() );
        System.out.println("Vehículo más barato: " + Concesionaria.vehiculoMasBarato(vehiculos).mostrarMarcaYModelo() );
	}
	
	// Imprime por pantalla todos los vehiculos de la lista con todos sus atributos
    public static void mostrarVehiculos(ArrayList <Vehiculo> lista){
    	 for (Vehiculo vehiculo: lista) {
             System.out.println(vehiculo);
         }
    }
    
	// Imprime por pantalla el vehículo que contiene la palabra buscada
    public static void mostrarVehiculoBuscado(Vehiculo vehiculo){
    	System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + vehiculo.mostrarMarcaYModelo() + " $" + vehiculo.toStringPrecio() );
    }
    
	// Imprime por pantalla la lista ordenada mostrando únicamente marca y modelo
    public static void mostrarListaOrdenada(ArrayList <Vehiculo> lista) {
    	System.out.println("Vehículos ordenados por precio de mayor a menor:");
    	for (Vehiculo vehiculo: lista) {
             System.out.println(vehiculo.mostrarMarcaYModelo());
         }
    }
  
}
