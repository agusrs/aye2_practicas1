package aye2_practica7;

public class Planta extends EmpleadoEj4 {
	private int salario;
	private int anosAntiguedad;
	
	public Planta(int salario) {
		this.salario = salario;
		anosAntiguedad = 0;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public int getAnosAntiguedad() {
		return anosAntiguedad;
	}
	
	public void setAnosAntiguedad(int anosAntiguedad) {
		this.anosAntiguedad = anosAntiguedad;
	}
	
	public void pagarSalario(){
		System.out.println("Pagando salario empleado planta");
	}
	
}
