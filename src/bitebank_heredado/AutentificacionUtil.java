package bitebank_heredado;

public class AutentificacionUtil {
	 
	private String clave;
	
	public boolean IniciarSesion(String clave) {
		
		return this.clave == clave;
	}
	
	public void setClave (String clave) {
		this.clave = clave;
	}

}
