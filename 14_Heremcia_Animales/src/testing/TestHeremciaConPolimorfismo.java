package testing;

import java.util.ArrayList;

import modelo.javabean.Animal;
import modelo.javabean.Gato;
import modelo.javabean.Perro;

public class TestHeremciaConPolimorfismo {

	public static void main(String[] args) {
	
		Animal animal1 = new Animal(4, true, "Animal a secas");
		Gato gato1 = new Gato(4, true, "Con botas", 7);
		Perro perro1= new Perro(4, true, "punchi", "callejero");
		
	Animal animal2, gato2, perro2;
		
		animal2 = new Animal(2, false, "Calamar");
		gato2 = new Gato(4, true, "Felix", 3);
		perro2 = new Perro(4, true, "gancho", "cazador");
		
		ArrayList<Animal> zoo = new ArrayList<>();
		
		zoo.add(perro1);
		zoo.add(animal1);
		zoo.add(gato1);
		zoo.add(animal2);
		zoo.add(perro2);
		zoo.add(gato2);
	
		for ( Animal animal: zoo ) {
			animal.sonido();
	//polimorfismo ventaja una sola llamada, llamo a sonido ( del padre) y lo tienen todos
			/*
			 * esta es la salida
			 * Guauuuuu
			y soy generico
			y hago MIAUUU
			y soy generico
			Guauuuuu
			y hago MIAUUU
			 */
			
	//*** ahora si soy un perro realmente o un gato realmente quiero ver las vidas que tengo
	// para ello hay que acudir a una palabra reservada en Java instanceof,
			if(animal instanceof Gato) {
				// hacer un casting (Gato)animal. pero me siguien saliendo metodos de animal al poner
				// ((Gato)animal). ya si obtengo los metdos de gato para oper
				System.out.println(((Gato)animal).getVidas());
			}else if (animal instanceof Perro) {
				System.out.println(((Perro)animal).getRaza());
			}
		}
		// quiero obtener una variable gato, del gato2, quiero un gato, es decir quiero ejecutar un metodo
		// a partir de una variable q es de tipo padre hay que hacer casting
		Gato miGato = (Gato)gato2;
	}

}
