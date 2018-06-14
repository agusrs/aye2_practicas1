package modelo_parcial2;

public class Articulo {
	private String nombre;
	private int precio;
	private int cant;
	
	public Articulo(String nombre, int precio, int cant) {
		this.nombre = nombre;
		this.precio = precio;
		this.cant = cant;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
