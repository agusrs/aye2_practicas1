package aye2_practica6;

public class PruebasPractica6 {

	public static void main(String[] args) {
		//ejercicio  prueba lampara
		Lamparita lamp1 = new Lamparita();
		
		System.out.println("La lamparita esta " + lamp1.getEstado().toString());
		
		lamp1.encender();
		
		System.out.println("La lamparita esta " + lamp1.getEstado());
		
		//ejercicio 6 Prueba de hora
		Hora h1 = new Hora(1, 140, 160);
		Hora h2 = new Hora(2, 35, 102);
		
		System.out.println("La hora h1 es: " + h1);
		System.out.println("La suma de h1 y h2 es: " + Hora.sumar(h1, h2));
		
		//ejercicio 7 Prueba empleado
		Empleado emp1 = new Empleado(1, "pepe");
		emp1.verDatos();
		
		//ejercicio 8 Prueba punto
		Punto p1 = new Punto(18, 25);
		Punto p2 = new Punto(21, 30);
		
		Punto.suma(p1, p2);
		p2.setX(18);
		p2.setY(25);
		System.out.println(Punto.igual(p1, p2));
		
	}

}
