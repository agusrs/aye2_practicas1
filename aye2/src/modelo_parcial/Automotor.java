package modelo_parcial;

public class Automotor extends Bien implements Asegurable, Transferible, Gravable {
	
	private float prima;
	private float alicuota;
	
	@Override
	public void setAlicuota(float alicuota) throws AlicuotaInvalidaException {
		// TODO Auto-generated method stub
		if (alicuota<=0){
			throw new AlicuotaInvalidaException();
		}
		this.alicuota = alicuota;
	}
	
	@Override
	public float getAlicuota() {
		// TODO Auto-generated method stub
		return alicuota;
	}
	
	@Override
	public float calcularImpuesto() {
		// TODO Auto-generated method stub
		return alicuota * valorFiscal;
	}
	
	@Override
	public void transferir(Titular nuevoTitular) throws TransferenciaInvalidaException{
		// TODO Auto-generated method stub
		if (titular.equals(nuevoTitular)){
			throw new TransferenciaInvalidaException();
		}
		try {
			Empresa.notificarTransferencia(titular, codigo);
		} catch (EmailNotSentException e){
			System.out.println("Email no enviado");
		}
		
		titular = nuevoTitular;
	}
	
	@Override
	public void setPrima(float prima) throws PrimaInvalidaException{
		// TODO Auto-generated method stub
		if (prima < 0 || prima > valorMercado){
			throw new PrimaInvalidaException();
		}
		this.prima = prima;
	}
	
	@Override
	public float getPrima() {
		// TODO Auto-generated method stub
		return prima;
	}
	
	
}
