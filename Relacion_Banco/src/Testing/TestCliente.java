package Testing;

import modelo.dao.ClienteDaoImplList;
import modelo.javabean.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		
		ClienteDaoImplList clidao = new ClienteDaoImplList();
		System.out.println("Listar todos");
		for (Cliente cliente: clidao.buscarTodos())
		System.out.println(cliente);
		System.out.println("Listar por oficina");
		int idOficina = 9003;
		for (Cliente cliente: clidao.buscarClientesOficina(idOficina))
		System.out.println(cliente);
		System.out.println("Listar una");
		System.out.println(clidao.buscarUno("1111A"));

	}
//14. creo la clase CuentaDao
}
