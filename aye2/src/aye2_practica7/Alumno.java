package aye2_practica7;

public class Alumno extends PersonaEj2 {
	private int matricula;
	private int mensualidad;
	
	@Override
	public int getIngresos() {
		return mensualidad;
	}
	
}
