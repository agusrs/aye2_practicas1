package aye2_practica6;

public class Punto {
	
	private float x;
	private float y;
	
	public Punto(){
		x = 0;
		y = 0;
	}
	
	public Punto(float x, float y){
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public static void suma(Punto p, Punto q){
		Punto result = new Punto();
		result.x = p.x + q.x;
		result.y = p.y + q.y;
		System.out.println("El resultado de la suma es: " + "x= " + result.x + " y= " + result.y);
	}
	
	public static boolean igual(Punto p, Punto q){
		return (p.x == q.x) && (p.y == q.y);
	}
	
	
}
