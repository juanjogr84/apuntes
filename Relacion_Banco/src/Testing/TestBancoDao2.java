package Testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabean.Oficina;

public class TestBancoDao2 {

	public static void main(String[] args) {
		// creo la oficina
		
		Oficina of2 = new Oficina(9001, "madrid 17", "madrid555", "912345678");
		BancoDaoImplList mibanco = new BancoDaoImplList(" MI BANCO");
		
		System.out.println(mibanco.modificarOficina(of2));
		System.out.println("Nueva lista");
		
		for (Oficina ele : mibanco.buscarTodos()) {
			System.out.println(ele);
		}
		//**44**
		System.out.println("UNO");
		System.out.println(mibanco.busarUna(9013));
	}
	
//9. modifico la clase Oficina, simulo que se me ha olvidado meter la ciudad**55**
	//10 testing BuscarPorOficinas
}
