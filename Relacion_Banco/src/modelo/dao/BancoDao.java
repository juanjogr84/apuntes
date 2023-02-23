package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;
import modelo.javabean.Oficina;

public interface BancoDao {

	boolean altaOficina(Oficina oficina);// clase "Oficina" y el dato "oficina"
	boolean eliminarOficina(Oficina oficina);// me pasan la oficina y la elimino
	Oficina elimiarOficina(int posRelativa);// devuelvo la oficina segun su posicion
	Oficina modificarOficina(Oficina oficina);
	Oficina busarUna(int idOficina);
	ArrayList<Oficina> buscarTodos();// importar de javalist, el ArrayList
	ArrayList<Oficina> buscarPorPrefijo(String prefijo);
	ArrayList<Oficina> buscarPorCiudad(String ciudad);
	
	//6.creo clase BancoDAoImplList
}
