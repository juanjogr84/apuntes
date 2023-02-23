package Testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabean.Oficina;

public class TestBuscarPorOficinas {

	public static void main(String[] args) {
		// para hacer el test nos creamos una variable de tipo banco
		
		BancoDaoImplList banco = new BancoDaoImplList("BANCO");
		
		// creamos una variable de tipo String para no pedirla por scanner
		
		String ciudad = "MADRID"; // asi como estaba en minusculas en el ejemplo
		// creamos una String prefijo
		String prefijo = "9127";
		// nos aparecera la primera en Mayusculas
		
		System.out.println("Listar oficinas por ciudad");
		for(Oficina oficina: banco.buscarPorCiudad(ciudad)) {
		System.out.println(oficina);

	}
		System.out.println("Listar oficinas por prefijo Telefonico");
		for(Oficina oficina: banco.buscarPorPrefijo(prefijo)) {
		System.out.println(oficina);
		/*
		 *  no nos da ninguno, xq subString no funciona asi
		 *  .substring(0 donde empieza, 1 y dime cuantos quieres)
		 *  si le pones (0,2) ya los coge
		 *  ¿Como le digo substring que me coga tanto caracteres como me vienen en el prefijo?
		 *  .substring(0,prefijo.length())
		 */
		//11. creo interface ClienteDao

	}
System.out.println("FIN DE PROGRAMA");
	}
}