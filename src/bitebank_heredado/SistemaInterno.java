package bitebank_heredado;

public class SistemaInterno {
	
	private String clave = "AluracursosOnline";

		
		public boolean autentica(Autenticable gerente) {
			boolean puedeIniciarSesion = gerente.IniciarSesion(clave);
			if (puedeIniciarSesion) {
				System.out.println("Login exitoso");
				
				return true;
				
			} else {
				
				System.out.println("Error de login");
				return false;
			} 
			
		}

}
