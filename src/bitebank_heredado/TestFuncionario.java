package bitebank_heredado;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Contador ();
		funcionario.setNombre ("Diego");
		funcionario.setDocumento("7273464");
		funcionario.setSalario(2000);
		funcionario.setTipo(0);
		
		
		
		System.out.println("$"+funcionario.getSalario() );
		System.out.println("$"+funcionario.getBonificacion());

	}

}
