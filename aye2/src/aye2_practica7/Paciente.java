package aye2_practica7;

import java.util.Date;

public class Paciente extends PersonaEj4 {
	private int codigoDiagnostico;
	private int telefono;
	private Date fechaNacimiento;
	
	public Paciente(int codigoDiagnostico, int telefono, Date fechaNacimiento) {
		this.codigoDiagnostico = codigoDiagnostico;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCodigoDiagnostico() {
		return codigoDiagnostico;
	}

	public void setCodigoDiagnostico(int codigoDiagnostico) {
		this.codigoDiagnostico = codigoDiagnostico;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public void leer(){
		System.out.println("El paciente: " + getNombre() + " esta leyendo");
	}
	
	@Override
	public void mostrar(){
		System.out.println("Paciente: " + getCodigoDiagnostico() + " Nombre: " + getNombre() + " Direccion: " + getDireccion() + " " + getCiudad() + " Fecha de nacimiento: " + getFechaNacimiento() + " Telefono: " + getTelefono());
	}
	
	public void enviarFactura(){
		System.out.println("Enviando factura");
	}
}
