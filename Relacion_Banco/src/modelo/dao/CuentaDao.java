package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;

public interface CuentaDao {

	boolean alta(Cuenta cuenta);
	Cuenta  buscarUno(int idCuenta);
	ArrayList<Cuenta> buscarTodos();
	ArrayList<Cuenta> buscarPorClientes( String idCliente);

}//15. creo la clase cuentaDaoImplemetList
