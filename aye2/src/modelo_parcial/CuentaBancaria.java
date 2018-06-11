package modelo_parcial;

public class CuentaBancaria extends Bien implements Transferible {
	
	public CuentaBancaria(Titular titular){
		super();
		asignarTitular(titular);
	}
	@Override
	public void transferir(Titular nuevoTitular) throws TransferenciaInvalidaException {
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

}
