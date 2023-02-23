package modelo.javabean;

public class Animal {
	protected int numeroPAtas; // datos son privados solo lo ve la clase Animal "El padre"
	protected boolean tienesVertebras;// Sólo en herencia si pones protected tus hijos veran tus datos
	protected String nombre;
	
	public Animal(int numeroPAtas, boolean tienesVertebras, String nombre) {
		super();
		this.numeroPAtas = numeroPAtas;
		this.tienesVertebras = tienesVertebras;
		this.nombre =nombre;
	}
	public Animal() {
		super();
	}
	public int getNumeroPAtas() {
		return numeroPAtas;
	}
	public void setNumeroPAtas(int numeroPAtas) {
		this.numeroPAtas = numeroPAtas;
	}
	public boolean isTienesVertebras() {
		// getter& setter si es boolean te aparece "is"
		return tienesVertebras;
	}
	public void setTienesVertebras(boolean tienesVertebras) {
		this.tienesVertebras = tienesVertebras;
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Animal [numeroPAtas=" + numeroPAtas + ", tienesVertebras=" + tienesVertebras + ", nombre=" + nombre
				+ "]";
	}
	
	public void saludar() {
		System.out.println("Soy un animal y me llamo : " + nombre); 
		// un syso en un javabean no se hace, xq no vale para ventanas, ni app de escritorio
	}
	
	public void sonido() {
		System.out.println("y soy generico"); 
		
	}
	
	public void medioLocomocion() {
		System.out.println("tengo muchos elige uno, terrestres, acuaticos, vuelan"); 
		
	}
	// ahora creo una clase gato, en modelo.javabean
}
