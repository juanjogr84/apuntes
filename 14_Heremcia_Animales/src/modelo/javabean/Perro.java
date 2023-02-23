package modelo.javabean;

public class Perro extends Animal{
	// como hereda hay que poner extends
	private String raza;

	public Perro() {
		super();
	}

	public Perro(int numeroPAtas, boolean tienesVertebras, String nombre, String raza) {
		super(numeroPAtas, tienesVertebras, nombre);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
// source override /implement methods, cogemos saludar,sonido,medioLocomocion
	@Override
	public void saludar() {
	System.out.println("Soy un perro de raza : " + raza);
	}

	@Override
	public void sonido() {
		System.out.println("Guauuuuu");
	}

	@Override
	public void medioLocomocion() {
		System.out.println("Terrestre");
	}

	@Override
	public String toString() {
		return "Perro [numeroPAtas=" + numeroPAtas + ", tienesVertebras=" + tienesVertebras + ", nombre=" + nombre
				+ ", raza=" + raza + "]";
	}
	// creamos testHerenciaPolimorfismo
	

}
