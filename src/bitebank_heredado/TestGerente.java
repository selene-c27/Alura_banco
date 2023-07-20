package bitebank_heredado;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente ();
		gerente.setNombre ("Sol");
		gerente.setDocumento("12345");
		gerente.setSalario(6000);
		gerente.setTipo(1);
		gerente.setClave("AluracursosOnline ");
		
		
		
		System.out.println("$"+gerente.getSalario());
		System.out.println("$"+gerente.getBonificacion());
		System.out.println(gerente.IniciarSesion("AluracursosOnline"));

	}

}
