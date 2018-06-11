package modelo_parcial;

public abstract class Bien {
	protected Titular titular;
	protected float valorMercado;
	protected float valorFiscal;
	protected int codigo;
	protected static int proximoCodigo;
	
	public Titular getTitular() {
		return titular;
	}

	public float getValorMercado() {
		return valorMercado;
	}

	public float getValorFiscal() {
		return valorFiscal;
	}

	public int getCodigo() {
		return codigo;
	}

	public static int getProximoCodigo() {
		return proximoCodigo;
	}

	public Bien(){
		codigo = proximoCodigo;
		proximoCodigo++;
	}

	public Bien(Titular titular) {
		this.titular = titular;
	}
	
	public void setValorMercado(float valor) throws valorMercadoInvalidoException {
		if (valor < 0) {
			throw new valorMercadoInvalidoException();
		}
		valorMercado = valor;
	}
	
	public void setValorFiscal(float valor) throws valorFiscalInvalidoException {
		if (valor < 0) {
			throw new valorFiscalInvalidoException();
		}
		valorFiscal = valor;
	}
	
	public void asignarTitular(Titular titular){
		this.titular = titular;
	}
	
	public boolean equals(Bien bien2){
		return codigo == bien2.getCodigo();
	}
	
}
