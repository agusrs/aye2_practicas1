package aye2_practica7;

public class Alumno extends Persona {
	private int matricula;
	private int mensualidad;
	
	@Override
	public int getIngresos() {
		return mensualidad;
	}
	
}
