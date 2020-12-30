package com.trainee.ejercicio.EjercicioTrainee;

import java.util.ArrayList;
import com.trainee.ejercicio.entidades.Auto;
import com.trainee.ejercicio.entidades.Concesionaria;
import com.trainee.ejercicio.entidades.Imprimir;
import com.trainee.ejercicio.entidades.Moto;
import com.trainee.ejercicio.entidades.Vehiculo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Auto auto1 = new Auto("Peugeot", "206", 4, (double) 200000);
        Moto moto1 = new Moto("Honda", "Titan", 125, (double) 60000);
        Auto auto2 = new Auto("Peugeot", "208", 5, (double) 250000);
        Moto moto2 = new Moto("Yamaha", "YBR", 160, 80500.50);
        
        ArrayList<Vehiculo> vehiculos = Concesionaria.generarListaDeVehiculos(auto1, moto1, auto2, moto2);
        Vehiculo buscado = null;
        
        Imprimir.mostrarVehiculos(vehiculos);
        System.out.println("=============================");
        
        Imprimir.mostrarVehiculosMayorMenor(vehiculos);
        buscado = Concesionaria.vehiculoQueContiene("Y", vehiculos); 
        Imprimir.mostrarVehiculoBuscado(buscado);
        System.out.println("=============================");
        
        Concesionaria.ordenarPorPrecioMayor(vehiculos);
        Imprimir.mostrarListaOrdenada(vehiculos);
    }
    
 }
