package aye2_practica7;

import java.util.ArrayList;

public class SistemaEscuela {
	
	private final static int LONGITUD_ARREGLO = 5;
	
	public static void main(String[] args) {
		
		//Arreglo estatico de personas
		PersonaEj2[] aPersona = new PersonaEj2[LONGITUD_ARREGLO];
		
		aPersona[0] = new EmpleadoEj2();
		aPersona[1] = new Alumno();
		
		for (int i = 0; i < aPersona.length; i++) {
			System.out.println(i + ": " + aPersona[i]);
		}
		
		//Arreglo dinamico de personas
		ArrayList<PersonaEj2> aPersona2 = new ArrayList<>();
		aPersona2.add(new EmpleadoEj2());
		aPersona2.add(new EmpleadoEj2());
		aPersona2.add(new Alumno());
		
		for (int i = 0; i < aPersona2.size(); i++) {
			System.out.println(i + ": " + aPersona2.get(i));
		}
		
		for (PersonaEj2 p : aPersona2) {
			System.out.println(p);
		}
		

	}

}
