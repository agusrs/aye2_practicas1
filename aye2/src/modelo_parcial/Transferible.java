package modelo_parcial;

public interface Transferible {
	
	void transferir(Titular nuevoTitular) throws TransferenciaInvalidaException;
}
