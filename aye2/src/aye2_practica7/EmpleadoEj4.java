package aye2_practica7;

public abstract class EmpleadoEj4 extends PersonaEj4 {
	protected int codigoEmpleado;
	protected int horasExtras;
	protected String companiaSeguro;
	
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	
	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	
	public int getHorasExtras() {
		return horasExtras;
	}
	
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public String getCompaniaSeguro() {
		return companiaSeguro;
	}
	
	public void setCompaniaSeguro(String companiaSeguro) {
		this.companiaSeguro = companiaSeguro;
	}
	
	@Override
	public void leer(){
		System.out.println("El empleado: " + getNombre() + " esta leyendo");
	}
	
	@Override
	public void mostrar(){
		System.out.println("Empleado: " + getCodigoEmpleado() + " Nombre: " + getNombre() + " Direccion: " + getDireccion() + " " + getCiudad() + "Cantidad de horas extras: " + getHorasExtras() + " Compania de Seguro: " + getCompaniaSeguro());
	}
	
	public void enviarSalario(){
		System.out.println("Enviando salario");
	}
}
