package testing;

import modelo.javabean.Animal;
import modelo.javabean.Gato;
import modelo.javabean.Perro;

public class TestHerencia {

	public static void main(String[] args) {
	//	Animal animal1 = new Animal(4, true, "Animal a secas");
	//	animal1.saludar();
		
		Gato gato1 = new Gato(4, true, "Con botas", 7);
		
		gato1.saludar();// sale soy un animal y me llamo: con botas
		// ojo sale soy generico, xq estoy invocando un metdo de mi padre, escrito por mi padre
		gato1.sonido();
		
		// como no me gusta, y lo quiero cambiar, 
		//1) ir a gato
		//2) source Override/implement Methods, cliqueas las que quieres redefinir
		
		gato1.medioLocomocion();
		
		// ahora me creo un perro, modelo.javabean class perro
		
		Perro perro1 = new Perro(4, true, "punchi", "callejero");
		perro1.saludar();
		perro1.sonido();
		perro1.medioLocomocion();
		
		// continuamos el ejercicio vamos a testing,new class, "TestHerenciaPolimorfismo" con main
	}

}
