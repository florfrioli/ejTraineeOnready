package com.trainee.ejercicio.entidades;

public class Moto extends Vehiculo{
	int cilindrada;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Moto(String marca, String modelo, int cilindrada, Double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " + cilindrada + "cc // Precio: $" + this.toStringPrecio();
	}
	
}
