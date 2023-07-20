package bitebank_heredado;

public class TestReferencia {

	public static void main(String[] args) {
		
		// El elemento mas generico puede ser adaptado al elemento mas especifico;
	
		Funcionario funcionario = new Gerente();
		
		funcionario.setNombre("Adolfo");
		
		Gerente gerente =new Gerente();
		
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		System.out.println(gerente.getSalario());
		System.out.println(funcionario.getSalario());
		
		
		
		
		
		

	}

}
