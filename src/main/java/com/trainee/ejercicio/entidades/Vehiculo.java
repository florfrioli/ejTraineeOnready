package com.trainee.ejercicio.entidades;

import java.text.DecimalFormat;

public abstract class Vehiculo {
	String marca;
	String modelo;
	Double precio;
	DecimalFormat formatoPrecio = new DecimalFormat("###,###.00");
	
	public Vehiculo(String marca, String modelo, Double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Precio: " + precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public String toStringPrecio() {
		return this.formatoPrecio.format(precio);
	}
	
	public String mostrarMarcaYModelo() {
		return this.getMarca() + " " + this.getModelo();
	}
	
	
}


