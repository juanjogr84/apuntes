package Testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabean.Oficina;

public class TestBanco {

	public static void main(String[] args) {
		// creamos el banco
		
		BancoDaoImplList mibanco = new BancoDaoImplList("MI BANCO");// banco creado
		
		System.out.println("BUSCAR TODOS");// indico que voy hacer o mostrar
		
		for (Oficina ele : mibanco.buscarTodos()) { //mibanco.buscarTodos()= metodo que me devuelve las oficinas
			System.out.println(ele);// ele = cada oficina
		}
		
		System.out.println("ALTA OFICINA"); 
		//**111**creamos una oficina para ver si funciona
		
		Oficina of1 = new Oficina(9005, "barcelona 1", "barcelona","934125657");
		
		// ahora ir a BancoDaoImplList y cogemos una oficina y la pegamos
		
		Oficina of2 = new Oficina(9001, "madrid 1", "madrid", "912345678");
		
		//vamos a ver lo que nos da
		
		
		System.out.println(mibanco.altaOficina(of1));// tiene que dar true
		System.out.println(mibanco.altaOficina(of2));// tiene que dar false
		// como se que se han dado de alta las oficinas? porque vuelvo a leer todos
		//uso el for y los vuelvo a leer
		
		//**222**
		System.out.println("ELIMINAR OFICINA por objeto");
		System.out.println("Elimiando 9005 true: " + mibanco.eliminarOficina(of1));
		System.out.println(mibanco.elimiarOficina(0));// **333**
		System.out.println("la lista nueva es");
		for (Oficina ele : mibanco.buscarTodos()) 
			System.out.println(ele);
		
		// como se borra una oficina, nos vamos a BancoDaoImplList
		// buscamos el metodo eliminarOficina,
		// pongo este syso System.out.println("ALTA OFICINA"); encima del for
		/*
		 * 8.creo testBanco2(main)porque esta muy saturado
		 */

		
	}

}
