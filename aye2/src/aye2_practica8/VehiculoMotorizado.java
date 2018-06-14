package aye2_practica8;

public abstract class VehiculoMotorizado {
	protected int fabricante;
	protected String modelo;
	protected short anofrabricacion;
	protected int kilometraje;
	
	public int getFabricante() {
		return fabricante;
	}
	public void setFabricante(int fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public short getAnofrabricacion() {
		return anofrabricacion;
	}
	
	public void setAnofrabricacion(short anofrabricacion) {
		this.anofrabricacion = anofrabricacion;
	}
	
	public int getKilometraje() {
		return kilometraje;
	}
	
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	
	
	
	
}
