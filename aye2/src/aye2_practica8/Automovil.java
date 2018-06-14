package aye2_practica8;

public class Automovil extends VehiculoMotorizado implements CapacidadLimite {
	
	enum TIPOAUTO {NORMAL, VAN}
	private TIPOAUTO tipo;
	private String estilo;
	private int limitePasajeros;
	
	public Automovil(String estilo, String tipo) {
		if (tipo == "NORMAL") {
			this.tipo = TIPOAUTO.NORMAL;
		} else if (tipo == "VAN") {
			this.tipo = TIPOAUTO.VAN;
		}
		this.estilo = estilo;
		this.limitePasajeros = 0;
	}

	public TIPOAUTO getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo == "NORMAL") {
			this.tipo = TIPOAUTO.NORMAL;
		} else if (tipo == "VAN") {
			this.tipo = TIPOAUTO.VAN;
		}
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public int getLimitepasajeros() {
		return limitePasajeros;
	}
	
	public void setLimitePasajeros(int limitePasajeros){
		this.limitePasajeros = limitePasajeros;
	}
	
	public void autorizarLimitePasajeros() {
		if (tipo == TIPOAUTO.NORMAL) {
			limitePasajeros = LIMITEAUTONORMAL;
		}else if (tipo == TIPOAUTO.VAN) {
			limitePasajeros = LIMITEAUTOVAN;
		}
	} 
	
}
