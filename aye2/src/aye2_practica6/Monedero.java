package aye2_practica6;

public class Monedero {
	private float dinero;

	public Monedero() {
		dinero = 0;
	}

	public Monedero(float dinero) {
		this.dinero = dinero;
	}

	public float getDinero() {
		System.out.println("Su saldo es: " + getDinero() + " pesos");
		return dinero;
		
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
		System.out.println("Su saldo es: " + getDinero() + " pesos");
	}
	
	public void agregarDinero(float d){
		dinero += d;
		System.out.println("Su saldo es: " + getDinero() + " pesos");
	}
	
	public void sacarDinero(float d){
		if (d > dinero) {
			System.out.println("No tiene suficiente dinero, le quedan: " + getDinero() + " pesos");
		}
		else {
			dinero -= d;
			System.out.println("Su saldo es: " + getDinero() + " pesos");
		}
			
	}
	
}
