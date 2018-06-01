package aye2_practica7;

public class Proveedor extends PersonaEj4 {
	private int codigoVendedor;
	private int saldo;
	private int fax;
	private int telefono;
	private double descuentos;
	
	public Proveedor(int codigoVendedor, int fax, int telefono) {
		this.codigoVendedor = codigoVendedor;
		this.fax = fax;
		this.telefono = telefono;
		saldo = 0;
		descuentos = 0;
	}
	
	public int getCodigoVendedor() {
		return codigoVendedor;
	}
	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public double getDescuentos() {
		return descuentos;
	}
	public void setDescuentos(double descuentos) {
		this.descuentos = descuentos;
	}
	
	@Override
	public void leer(){
		System.out.println("El proveedor: " + getNombre() + " esta leyendo");
	}
	
	@Override
	public void mostrar(){
		System.out.println("Proveedor: " + getCodigoVendedor() + " Nombre: " + getNombre() + " Direccion: " + getDireccion() + " " + getCiudad() + " Saldo: " + getSaldo() + " Descuentos: " + getDescuentos() + " Telefono: " + getTelefono() + " Fax: " + getFax());
	}
	
	public void pagarFactura(){
		System.out.println("Pagando factura");
	}
}
