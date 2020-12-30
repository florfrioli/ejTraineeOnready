package com.trainee.ejercicio.entidades;

public class Auto extends Vehiculo {
	int puertas;

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public Auto(String marca, String modelo, int puertas, Double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + puertas + " // Precio: $" + this.toStringPrecio();
	}
	

}
