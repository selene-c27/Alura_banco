package bitebank_heredado;

public interface Autenticable  {
	


	public String getClave();
	
	public  void setClave(String clave);
	
 public boolean IniciarSesion(String clave);
	
}