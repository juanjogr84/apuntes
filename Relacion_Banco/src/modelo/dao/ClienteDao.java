package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;

public interface ClienteDao {
	
	boolean alta(Cliente cliente);
	// doy de alta (boolean)un Cliente que le llamo cliente 
	
	Cliente buscarUno(String idCliente);
	ArrayList<Cliente> buscarTodos();
	ArrayList<Cliente> buscarClientesOficina( int idOficina);

}
//12. creo clase ClienteDaoImplist