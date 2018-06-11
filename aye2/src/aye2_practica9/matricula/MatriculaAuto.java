package aye2_practica9.matricula;

public class MatriculaAuto {
	private char letra;
	private int numero;
	private boolean esValido;
	
	public MatriculaAuto(char letra, String digitos) throws MatriculaAutoException{
		if (letra != 'A' && letra != 'B'){
			throw new LetraInvalidaException("La letra (" + letra + ") es invalida");
		}
		
		if (digitos.length() != 8){
			throw new CantidadDigitosInvalida("La cantidad de digitos (" + digitos.length() + ") es invalida");
		}
		
		numero = Integer.parseInt(digitos);
		this.letra = letra;
	}
	
	public MatriculaAuto(){
		esValido = true;
	}
	
	public void setLetra(char letra){
		try {
			if (letra != 'A' && letra != 'B'){
			throw new LetraInvalidaException("La letra (" + letra + ") es invalida");
			}

			this.letra = letra;
		} catch (LetraInvalidaException e) {
			System.out.println("Letra invalida");
		}
		
	}
	
	public void setNumero(String digitos){
		try {
			if (digitos.length() != 8){
			throw new CantidadDigitosInvalida("La cantidad de digitos (" + digitos.length() + ") es invalida");
			}
		
			numero = Integer.parseInt(digitos);
		} catch (CantidadDigitosInvalida e) {
			System.out.println("El numero es invalido");
			esValido = false;
		} catch (NumberFormatException e) {
			System.out.println("El numero es invalido");
			esValido = false;
		}
		
	}
	
	@Override
	public String toString(){
		return "Matricula Auto: " + letra + "-" + numero;
	}
	
	public static void main(String[] args) {
		
		MatriculaAuto mat;
		
		try {
			mat = new MatriculaAuto('A', "12345678");
		} catch (MatriculaAutoException e) {
			System.out.println("Error de instanciacion:" + e);
		} catch (NumberFormatException e) {
			System.out.println("Error en formato de numero");
			System.out.println(e);
		}
	}

}
