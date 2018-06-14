package aye2_practica7;

import java.util.List;

public class Empresa {
	private String nombre;
	private List<Area> areas;
	
	public Area obtenerAreaEmp(int empleado){
		Area aux = null;
		for (Area area : areas) {
			for (EmpleadoEj20 emp : area.getEmpleados()) {
				if (emp.getNroemp() == empleado) {
					aux = area;
				}
			}
		}
		return aux;
	}
	
	public void registrarEmpleado(String nombre, String apellido, int numero, int codigo){
		EmpleadoEj20 e = new EmpleadoEj20(nombre, apellido, numero);
		for (Area area : areas) {
			if (area.getCodigo() == codigo) {
				area.getEmpleados().add(e);
			}
		}
	}
	
	public void transferirEmpleado(int empleado, int area){
		
	}
	
}
