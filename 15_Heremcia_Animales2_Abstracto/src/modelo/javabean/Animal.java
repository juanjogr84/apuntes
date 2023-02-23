package modelo.javabean;

public abstract class Animal {
	
	protected int numeroPAtas;
	protected boolean tienesVertebras;
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
	//****  declaramos los metodos abstractos****
	
	public abstract void saludar();
		
	public abstract void  sonido();
	
	public abstract void medioLocomocion();
		
		
}
	

