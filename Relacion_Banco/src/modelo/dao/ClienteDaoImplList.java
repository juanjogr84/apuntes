package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;
import modelo.javabean.Oficina;

public class ClienteDaoImplList implements ClienteDao {

	private ArrayList<Cliente> lista; // y le llamo lista
	
	// creamos el constructor client + ctrl+barra
	public ClienteDaoImplList() {
		lista = new ArrayList<>();
		//para probar, creamos clientes pues hago cargarDAtos 
		cargarDatos();
	}
	
	private void cargarDatos() {
		//cargar datos de un empleado como se hacia?
		//para ello me creo una variable BancoDaoImplList bdao = new BancoDaoImplList(null) este null= BancoDaoImplList
		
		BancoDaoImplList bdao = new BancoDaoImplList(null);
		//lista.add(new Cliente ctrl+barra (con todo)
		
		lista.add(new Cliente("1111A", "Eva", "Garcia","calle luz 36" , "egarcia@home.es", bdao.busarUna(9001)));
		lista.add(new Cliente("2222A", "Sara", "Varas","calle oscuridad 42" , "varas@home.es", bdao.busarUna(9001)));
		lista.add(new Cliente("3333A", "Carlos", "Largos","calle pez 36" , "clargos@home.es", bdao.busarUna(9003)));
		// una vez añadido mas clientes public class pones implements add methods
		
		// faltaria la oficina y se puede obtener de lista.add(new Cliente("1111A", "Eva", "Garcia","calle luz 36" , "egarcia@home.es",**))
		
		// ahora me creo una variable de TrabajoImplListDao y uno de DepartamentoImperlListDao, hago un buscar uno, meto el departamento, el trabajo 3 o lo que sea
		
	}

	@Override
	public boolean alta(Cliente cliente) {
		if(lista.contains(cliente))
			return false;
		else
			return lista.add(cliente);
	}

	@Override
	public Cliente buscarUno(String idCliente) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(idCliente);
		int posicion = lista.indexOf(cliente);
		
		if( posicion == -1)
			return null;
		
		return lista.get(posicion);
	}

	@Override
	public ArrayList<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public ArrayList<Cliente> buscarClientesOficina(int idOficina) {
		ArrayList<Cliente> aux = new ArrayList<>();
		for (Cliente cliente: lista) {            // aqui Tomas pone Cliente ele
			if (cliente.getOficina().getIdOficina() == idOficina)
				aux.add(cliente);
		}
		return aux;
	}// creo la clase TestCliente
	}

