package aye2_practica8;

public class Camion extends VehiculoMotorizado implements CapacidadLimite {
	enum Seguridad {BAJO, ALTO};
	
	private short remolques;
	private Seguridad nivel;
	private int limitePasajeros;
	
	public Camion(short remolques) {
		this.remolques = remolques;
		this.limitePasajeros = 0;
		this.nivel = null;
	}

	public short getRemolques() {
		return remolques;
	}

	public void setRemolques(short remolques) {
		this.remolques = remolques;
	}

	public Seguridad getNivel() {
		return nivel;
	}

	public void setNivel() {
		if (this.limitePasajeros > LIMITECAMION) {
			this.nivel = Seguridad.BAJO;
		} else {
			this.nivel = Seguridad.ALTO;
		}
	}

	public int getLimitepasajeros() {
		return limitePasajeros;
	}
	
	public void setLimitePasajeros(int limitePasajeros) {
		this.limitePasajeros = limitePasajeros;
	}
	
	public void autorizarLimitePasajeros() {
		this.limitePasajeros = LIMITECAMION;
	}
	
}
