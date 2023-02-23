package modelo.javabean;

import java.util.Objects;
//3.CREAR CLASE CUENTA
public class Cuenta {

	private int idCuenta;
	private String tipoCuenta;
	private double saldo;
	private Cliente cliente;
	public Cuenta() {
		super();
	}
	public Cuenta(int idCuenta, String tipoCuenta, double saldo, Cliente cliente) {
		super();
		this.idCuenta = idCuenta;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", tipoCuenta=" + tipoCuenta + 
				", saldo=" + saldo + ", cliente=" + cliente + "]";
	}// DOS CUENTAS SON IGUALES CUANDO idCuenta ES EL MISMO
	@Override
	public int hashCode() {
		return Objects.hash(idCuenta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cuenta))
			return false;
		Cuenta other = (Cuenta) obj;
		return idCuenta == other.idCuenta;
	}
	
	/*
	 * AQUI PODEMOS METER UN PAR DE METODOS
	 */
	
	public void ingresar(double cantidad) {
		saldo += cantidad;
		// Es decir, incrementa el saldo
	}
	
	public void extraer(double cantidad) {
		saldo -= cantidad;
		// Es decir, Restar el saldo
	}
	
	/*
	 *4. YA CREADAS LAS CLASES, SRC NEW CLASS BORRAR MODELO.JAVABEAN
	 * Y PONEMOS TESTING "TestAsociacion" con el main
	 */
	
}
