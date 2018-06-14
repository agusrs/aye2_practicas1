package aye2_practica7;

import java.util.ArrayList;
import java.util.List;

public class Area {
	private String nombre;
	private int codigo;
	private List<EmpleadoEj20> empleados;
	
	public Area(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		empleados = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public List<EmpleadoEj20> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<EmpleadoEj20> empleados) {
		this.empleados = empleados;
	}
	
	
}
