package aye2_practica6;

public class Vector3D {
	private float x;
	private float y;
	private float z;
	
	public Vector3D() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Vector3D(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
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

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public static void suma(Vector3D p, Vector3D q){
		Vector3D result = new Vector3D();
		result.x = p.x + q.x;
		result.y = p.y + q.y;
		result.z = p.z + q.z;
		System.out.println("El resultado de la suma es: " + "x= " + result.x + " y= " + result.y + " z= " + result.z);
	}
	
	public static boolean igual(Vector3D p, Vector3D q){
		return (p.x == q.x) && (p.y == q.y) && (p.z == q.z);
	}
	
	
	
}
