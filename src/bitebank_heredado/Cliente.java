package bitebank_heredado;

public class Cliente implements Autenticable {

    private String nombre;
    private String documento;
    private String telefono;
    private AutentificacionUtil util;
    
    
    
    public Cliente () {
    this.util = new AutentificacionUtil();
    	
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

	@Override
	public void setClave(String clave) {
		this.setClave(clave);
		
	}

	@Override
	public boolean IniciarSesion(String clave) {
		
		return this.util.IniciarSesion(clave);
	}

	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return null;
	}
}
