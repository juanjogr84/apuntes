package testing;

import modelo.javabeans.Familia;
import modelo.javabeans.Producto;

public class TestAsociacionFamilias {

	public static void main(String[] args) {
	 Familia fam1 = new Familia(1, "Pantalones");
	 
	 Producto prod1 = new Producto(1, "Pantalon verde hombre t48", 125, fam1);
	 
	 Producto prod2 = new Producto(2, "Falda vaquera mujer Txs", 70,
			 new Familia(2,"Faldas")); // no tengo familia falda, pues la creo
	 // comienzo prueba Pantalon
	 fam1.setDescripcion("PANTALON");
	 
	 // hago 2 syso para entender variable, familia del producto, sale lo mismo
	 
	 System.out.println("la variable fam1 : " + fam1);
	 System.out.println("la familia del producto1 : " + prod1.getFamilia());
	 
	 
	 System.out.println(fam1);
	 System.out.println("Descrip de la familia del prod 1: " + prod1.getFamilia().getDescripcion());
	 System.out.println("Descrip de la familia del prod 2: " + prod2.getFamilia().getDescripcion());
	 // hago prueba de que me he equivocado y quiero Pantalón
	}

}
