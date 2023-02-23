package testing;

import java.util.ArrayList;

import modelo.javabean.Animal;
import modelo.javabean.Gato;
import modelo.javabean.Perro;

public class TestHerenciaPolimorfismo {

	public static void main(String[] args) {
		// Creo 3 animales
		
		Animal animal, gato, perro;
		
		animal = new Animal(2, false, "Calamar");
		gato = new Gato(4, true, "Botas", 3);
		perro = new Perro(4, true, "punchi", "callejero");
		
		animal.saludar();// metodo mismo nombre difente implementacion = polimorfismo
		gato.saludar();
		perro.saludar();
		//---veamos la utilidad del polimorfismo
		// que pasa si tenemos un ArrayList
		
		ArrayList<Animal> animales = new ArrayList<>();
		animales.add(new Animal(2, false, "Calamar"));
		animales.add(new Gato(4, true, "Botas", 3));
		animales.add(new Perro(4, true, "punchi", "callejero"));
		//da igual que animal sea, que ejecutara el sonido de cada animal
		for (Animal ele : animales) {
			ele.sonido();
		}
		
		// que ocurre si gato quiere saber sus vidas?
		// convertimos el gato normal en un Animal
		Gato migato= (Gato)gato;// hago casting, se convierte un obj de tipo padre que es un hijo
		System.out.println(migato.getVidas());
		
		// supongamos Gato mi gato no esta, ahi que poner (((, solo valido HERENCIA))
		System.out.println(((Gato)gato).getVidas());
	}

}	// creo testHerenciaConPolimorfismo
