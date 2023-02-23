package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;
import modelo.javabean.Oficina;

public class BancoDaoImplList implements BancoDao{
	// encima de BancoDaoImplList add unimplemented methods, te saldra los metodos redefinidos
	//@overrride

		private String nombre;
		private ArrayList<Oficina> listaOficinas;
		
		public BancoDaoImplList(String nombre) {
			this.nombre = nombre;// asignar el nombre con el banco que me pasan 
			listaOficinas = new ArrayList<>();// arancamos la lista porque esta a null
			//pero estas listas estan vacias, lo normal es que las coga de una
			//base de datos,***creamos un metodo***
			cargarDatos();// este metodo cargara esos datos
			
		}//Despues del punto 9, continuo **55.1** aqui al modificar Oficina metiendo ciudad
		private void cargarDatos() {
			listaOficinas.add(new Oficina(9001, "madrid 1", "calle del pez 3","madrid","912745678"));
			listaOficinas.add(new Oficina(9002, "madrid 2", "calle de la flor 45","madrid", "912345678"));
			listaOficinas.add(new Oficina(9003, "guada 1","calle clavel 34", "guadalajara", "949345678"));
			listaOficinas.add(new Oficina(9004, "guada 2", "Avda de la flor 76","guadalajara", "949345678"));
			
		}
		// getter and setter pero solo de nombre, NO de idOficia por si quiere modificar el nombre

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/*
		 * ahora para implementar los metodos es necesario poner
		 * PUBLIC CLASS BancoDaoImplList IMPLEMENTS BANCODAO
		 * Cuando  implemento de una interface, como los metodos son abstracto obligado a redefinir de ahi
		 * @ override
		 */
		// comprobamos que no haya 2 oficinas iguales, y asi no la doy de alta
		// porque estaria repetida y la que no sea, se da de alta
		// syso testBanco para comprobar
		@Override
		public boolean altaOficina(Oficina oficina) {
		
			if(listaOficinas.contains(oficina))
				return false;
			else
				return listaOficinas.add(oficina);// no hace falta poner true, xq .add devuelve true
			//poner solo return listaOficinas.add(oficina); por lo tanto oficina por equivocacion no se da de alta
			// y si no esta se da de alta
			// vas al TestBanco y lo compruebas y te creas la oficina **111**
		}
		@Override
		public boolean eliminarOficina(Oficina oficina) {
		// si la encuentra la quita y ademas recorre el Array y aunq este en el medido lo recorre de manera ordenada
		// si devuelve true, devuelve true, si devuelve false devuelve false **222**
			return listaOficinas.remove(oficina); 
		}
	
		@Override
		public Oficina elimiarOficina(int posRelativa) {
			// hay que asegurarse de que la posicion es la correcta
			// al ser Oficina devuelve un null
			if(posRelativa >= listaOficinas.size()) // size devuelve el numero de elementos que hay
				return null;// null porque oficina si no existe la clase devuelve null
			return listaOficinas.remove(posRelativa); //**33**
		}
		@Override
		public Oficina modificarOficina(Oficina oficina) {
			// hay que saber la posicion banco y como no lo se busco indexOf
			// y el lo busca
			int posicion = listaOficinas.indexOf(oficina);
			// indexof= me pasa el obj, lo busco y te doy la posicion y si no lo encuentro te devuelvo -1
			
			if( posicion == -1)
				return null;
			return listaOficinas.set(posicion, oficina);
			
		}
		@Override //**44**
		public Oficina busarUna(int idOficina) {
			// hay crear un objeto con lo minimo, para que el busque, por el campo clave
			Oficina of = new Oficina();
			of.setIdOficina(idOficina);
			int posicion = listaOficinas.indexOf(of);// copias y pegas metodo modificarOficina por posicion
			
			if( posicion == -1)
				return null;
			
			return listaOficinas.get(posicion);
			/*
			 * otra forma( pero busca de 1 en 1) for(oficina ele : listaOficinas){
			 * if (ele.getIdOficina() == idOficina)
			 * return ele;
			 * }
			 */
			
		}
		//**** modificamos este como ejemplo****
		@Override
		public ArrayList<Oficina> buscarTodos() {
			
			return listaOficinas;
			
		}
		@Override
		public ArrayList<Oficina> buscarPorPrefijo(String prefijo) {
			ArrayList<Oficina> aux = new ArrayList<>();
			for (Oficina oficina: listaOficinas) {
				if (oficina.getTelefono().substring(0, prefijo.length()).equals(prefijo))//.length te da cuantos caracteres tiene prefijo
	// buscamos un metodo que nos devuelva los primeros caracteres substring donde empieza donde acaba y siendo igual prefijo que me pasan
					aux.add(oficina);
			}
			return aux;
		}
	
		@Override
		public ArrayList<Oficina> buscarPorCiudad(String ciudad) {
			ArrayList<Oficina> aux = new ArrayList<>();
			// la ciudad que tiene la oficina es la misma que la ciudad que me vienes? y añado a la aux la oficina
			for (Oficina oficina: listaOficinas) {
				// podia poner for ( Oficina ele: listaOficinas)
				if (oficina.getCiudad().equalsIgnoreCase(ciudad))
					aux.add(oficina);
			}
			return aux; // aux= Contiene solo las oficinas que tiene esa ciudad(crear testing testBuscarPorOficinas, con main
		}
		
		//7. para probar si funciona los metodos, crear clase TestBanco con main
}
