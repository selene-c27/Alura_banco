package bitebank_heredado;

public class Administrador extends Funcionario implements  Autenticable {
	
	private AutentificacionUtil util;
	
	public Administrador() {
		this.util =new AutentificacionUtil();
	}
	

	@Override
	public double getBonificacion() {
		
		return this.getSalario();
	}

	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClave(String clave) {
		this.setClave(clave);;

		
	}

	@Override
	public boolean IniciarSesion(String clave) {

		return this.util.IniciarSesion(clave);
	}

}
