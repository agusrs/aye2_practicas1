package aye2_practica6;

public class PruebasPractica6 {

	public static void main(String[] args) {
		Lamparita lamp1 = new Lamparita();
		
		System.out.println("La lamparita esta" + lamp1.getEstado().toString());
		
		lamp1.encender();
		
		System.out.println("La lamparita esta " + lamp1.getEstado());

	}

}
