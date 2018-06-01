package aye2_practica7;

public class Eventual extends EmpleadoEj4 {
	private int honorariosPorHora;

	public Eventual(int honorariosPorHora) {
		this.honorariosPorHora = honorariosPorHora;
	}

	public int getHonorariosPorHora() {
		return honorariosPorHora;
	}

	public void setHonorariosPorHora(int honorariosPorHora) {
		this.honorariosPorHora = honorariosPorHora;
	}
	
	public void pagarSalario(){
		System.out.println("Pagando salario empleado eventual");
	}
}
