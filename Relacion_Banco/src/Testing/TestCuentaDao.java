package Testing;

import modelo.dao.ClienteDaoImplList;
import modelo.dao.CuentaDaoImplList;
import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;

public class TestCuentaDao {

	public static void main(String[] args) {
		
		CuentaDaoImplList cudao = new CuentaDaoImplList();
		System.out.println("Listar todos");
		for (Cuenta cuenta: cudao.buscarTodos())
		System.out.println(cuenta);
		System.out.println("Listar por cliente");
		
		String idCliente = "3333A";// no me funciona
		
		for (Cuenta cuenta: cudao.buscarPorClientes(idCliente))
		System.out.println(cuenta);
		System.out.println("Listar una");
		//Igual que testClienteDaoimplList, pero ahora lo optimizamos
		
		Cuenta cuenta =cudao.buscarUno(2000);
		System.out.println(cuenta);
		
		System.out.println("ciudad de oficina : " + cuenta.getCliente().getOficina().getCiudad().toUpperCase());
		

	}

}
