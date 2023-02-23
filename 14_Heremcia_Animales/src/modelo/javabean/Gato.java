package modelo.javabean;

public class Gato extends Animal {
	private int vidas;
	// constructos de una clase que hereda? todo

	public Gato() {
		super();
	}
	// en este caso al generar constructor, en la barrita doy al desplegable
	// eligo sin nada, y desmarco el atributo
	//******************************************************
	public Gato(int numeroPAtas, boolean tienesVertebras, String nombre, int vidas) {
		super(numeroPAtas, tienesVertebras, nombre);// a mi padre le paso sus datos
		this.vidas = vidas;// yo construyo los mios
	}
	// en este caso getter and setter del tuyo que es el que te deja
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	//si yo no recibo ni saludar, ni  sonido, ni medio de locomocion Que sale?
	// pues sale lo de tu padre que es lo unico que ahi
	//*****************************
	
	// al tener Animal(padre) con atributos privados, para que lo vean los hijos
	// normalmente se pone protected
	// public class Animal{
	//  protected int numeroPatas;
	// protected boolean tienesVertebras;
	//*****************************************
	//IMPORTANTE: Al hacer toString con todo, si quieres que salgan antes mis datos
	//que los de mi padre, de hacer  click "inherited fields", luego up( se veran mis datos arriba)
	@Override
	public String toString() {
		return "Gato [numeroPAtas=" + numeroPAtas + ", tienesVertebras=" + tienesVertebras + ", vidas=" + vidas + "]";
	}
	@Override
	public void setTienesVertebras(boolean tienesVertebras) {
		// TODO Auto-generated method stub
		super.setTienesVertebras(tienesVertebras);
	}
	
	
	// ahora nos vamos a src y nos creamos un test, nueva clase, Package "testing", name TestHerencia con main
	
	
	//*****************redefinir los metodos
	@Override
	public void saludar() {
		System.out.println("Soy un gato y me llamo : " + nombre);
	}
	@Override
	public void sonido() {
		System.out.println("y hago MIAUUU");
		
	}
	@Override
	public void medioLocomocion() {
	System.out.println("Soy terreste");
	}
	
}
