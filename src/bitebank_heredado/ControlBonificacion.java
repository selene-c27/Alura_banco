package bitebank_heredado;

public class ControlBonificacion {

	private double suma;
	public double registrarSalario(Funcionario funcionario) {
		
		this.suma =funcionario.getBonificacion()+ this.suma;
		System.out.println("Calculo actual: "+ this.suma);
		 return this.suma;
		 
	}
	//Todos los funcionarios van a ser aceptables para entrar como parametroen este metodo;
/*public double registrarSalario(Gerente gerente) {
		
		this.suma =gerente.getBonificacion()+ this.suma;
		System.out.println("Calculo actual: "+ this.suma);
		 return this.suma;
		 
	}
public double registrarSalario(Contador contador) {
	
	this.suma =contador.getBonificacion()+ this.suma;
	System.out.println("Calculo actual: "+ this.suma);
	 return this.suma;
	 
}*/


}
