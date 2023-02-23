package modelo.javabean;

import java.util.Objects;
//1. empezamos con la clase oficina que no tiene relacion entre ellas
public class Oficina {
	
	//atributos privados
	private int idOficina;
	private String nomnbre, direccion,ciudad, telefono;

	
	/*
	 * Constructores sin nada
	 */
	
	public Oficina() {
		super();
	}
	/*
	 * Constructor con todo
	 */
	
public Oficina(int idOficina, String nomnbre, String direccion, String telefono) {
	super();
	this.idOficina = idOficina;
	this.nomnbre = nomnbre;
	this.direccion = direccion;
	this.telefono = telefono;
}

// creamos otro constructor añadiendo ciudad **55**
public Oficina(int idOficina, String nomnbre, String direccion, String ciudad, String telefono) {
		super();
		this.idOficina = idOficina;
		this.nomnbre = nomnbre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
	}
/*
 * Getter and Setter con todo
 */

public int getIdOficina() {
	return idOficina;
}

public void setIdOficina(int idOficina) {
	this.idOficina = idOficina;
}

public String getNomnbre() {
	return nomnbre;
}

public void setNomnbre(String nomnbre) {
	this.nomnbre = nomnbre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}


public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}



//redefinir  métodos de Object, toString con todo y ya esta ciudad
@Override
public String toString() {
	return "Oficina [idOficina=" + idOficina + ", nomnbre=" + nomnbre + ", direccion=" + direccion + ", ciudad="
			+ ciudad + ", telefono=" + telefono + "]";
}




/*
 * como 2 oficinas son igualas generamos HashCode() and equals(), marcando 
 * esa clave primaria, en este caso idOficina
 */

@Override
public int hashCode() {
	return Objects.hash(idOficina);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Oficina))
		return false;
	Oficina other = (Oficina) obj;
	return idOficina == other.idOficina;
}

// AHORA VENDRIAN LOS METODOS PROPIOS, PERO CON ESTAS VARIABLES PUES PA QUE, 
// XQ CASI NO HAY, ASIQUE CLASE TERMINADA
//2. CREAR LA CLASE CLIENTE


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
