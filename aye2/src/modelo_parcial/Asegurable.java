package modelo_parcial;

public interface Asegurable {
	
	void setPrima(float prima) throws PrimaInvalidaException;
	
	float getPrima();
}
