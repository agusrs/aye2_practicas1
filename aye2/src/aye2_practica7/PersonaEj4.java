package aye2_practica7;

public abstract class PersonaEj4 {
	protected String nombre;
	protected String direccion;
	protected String ciudad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public abstract void leer();
	
	public abstract void mostrar();
	
}
