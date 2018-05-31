package aye2_practica7;

import java.util.Date;

public abstract class PersonaEj2 {
	protected String nombre;
	protected int dni;
	protected Date fechaNacimiento;
	
	public PersonaEj2() {
		nombre = new String("");
		fechaNacimiento = new Date();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public Date getFehaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFehaNacimiento(Date fehaNacimiento) {
		this.fechaNacimiento = fehaNacimiento;
	}
	
	public abstract int getIngresos();
	
	
	
}
