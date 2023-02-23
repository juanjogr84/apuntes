package Testing;
//4. TestAsociacion
import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;
import modelo.javabean.Oficina;

public class TestAsociacion {

	public static void main(String[] args) {
		Oficina of1 = new Oficina(9288, "Madrid2", "calle del pez,3, madrid", "914167899");
		Cliente cli1 = new Cliente("72345665B", "Angel", "Uria Benitez", "madrid", "ab@home.es", of1);
		
		Cuenta cuenta1 = new Cuenta(1000, "Ahorro", 2000, cli1);
		Cuenta cuenta2 = new Cuenta(2000, "corriente", 4000, new Cliente("88776655A", "Sara", "Perez Alvarez", "Sevilla","Sara@home.es", of1));
		
// AQUI PONGO NEW CLIENTE PORQUE NO TENGO AL CLIENTE(POR LO TANTO LO CREO)
		
// ahora no se que cuenta tiene ni na de na, ni saldo, ni ningun dato
		
		/*
		 * DESDE CUENTA 2 VAMOS A SACAR:
		 * CODIGO CUENTA, SALDO CUENTA,NOMBRE DEL TITULAR, APELLIDO CLIENTE, 
		 * TELEFONO DE LA OFICINA
		 */
	System.out.println("codigo cuenta y saldo : "+ cuenta2.getIdCuenta() + 
			 " - " + cuenta2.getSaldo());	
	System.out.println("apellidos del cliente : " +
			 cuenta2.getCliente().getApellidos());
	System.out.println("telefono oficina cliente de la cuenta 2 : " + cuenta2.getCliente().getOficina().getTelefono());
	
	}
// ahora nos hace falta una clase que tenga todas las oficinas,
//	5. crear interface
}
