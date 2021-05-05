package ar.edu.unju.fi.tp4.models;

import org.springframework.stereotype.Component;


@Component
public class Empleado {

	private int legajo;
	private String apellido;
	private String nombres;
	private double sueldo;
	
	public Empleado(int legajo, String apellido, String nombres, double sueldo) {
		this.legajo = legajo;
		this.apellido = apellido;
		this.nombres = nombres;
		this.sueldo = sueldo;
		
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	/**
	 * 
	 */
	public Empleado() {
		super();
	}
	
	
	
}
