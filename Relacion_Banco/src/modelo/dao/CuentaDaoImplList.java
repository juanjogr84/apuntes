package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;

public class CuentaDaoImplList implements CuentaDao {
	private ArrayList<Cuenta> lista; 
	public CuentaDaoImplList() {
		lista = new ArrayList<>();
		cargarDatos();
	}
	
	private void cargarDatos() {
	
		
		ClienteDaoImplList clidao = new ClienteDaoImplList();
		
		
		lista.add(new Cuenta(1000, "Ahorro", 2000, clidao.buscarUno("1111A")));
		// recurro a ClienteDaoImplList para obtenerlo
		
		lista.add(new Cuenta(2000, "Corriente", 7000, clidao.buscarUno("1111A")));// otra cuenta pero del mismo cliente
		lista.add(new Cuenta(3000, "Juevenil", 1000, clidao.buscarUno("3333A")));
		
		/* 
		 *  una vez hecho el array e implementado los datos
		 *  public class CuentaDaoImplList implements CuentaDaoo{
		 *  *****hay que implementar los metodos
		 */
	}

	@Override
	public boolean alta(Cuenta cuenta) {
		if(lista.contains(cuenta))
			return false;
		else
			return lista.add(cuenta);
	}

	@Override
	public Cuenta buscarUno(int idCuenta) {
		Cuenta cuenta = new Cuenta ();
		cuenta.setIdCuenta(idCuenta);
		int posicion = lista.indexOf(cuenta);
		
		if( posicion == -1)
			return null;
		
		return lista.get(posicion);
	}

	@Override
	public ArrayList<Cuenta> buscarTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public ArrayList<Cuenta> buscarPorClientes(String idCliente) {
		ArrayList<Cuenta> aux = new ArrayList<>();
		for (Cuenta cuenta: lista) {            // aqui Tomas pone Cuenta ele
			if (cuenta.getCliente().getIdCliente().equals(idCliente));// para llegar al idCliente saco el getCliente de cuenta y de aqui saco el idCliente, hay que hacer un equals xq es String
			aux.add(cuenta);
		}
		return aux;
	}//16. creo test CuentaDao

}
