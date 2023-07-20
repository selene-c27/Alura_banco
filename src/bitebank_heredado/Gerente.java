package bitebank_heredado;
// Esta es una clase hija;


//                      extiende de funcionario;
public class Gerente extends Funcionario implements Autenticable {
	
 //sobre escritura de metodo;
 public double getBonificacion() {
	 // super permite que se pueda tomar informacion de la clase padre;
	 return super.getSalario()+ this.getSalario() * 0.05;
 }

@Override
public String getClave() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setClave(String clave) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean IniciarSesion(String clave) {
	// TODO Auto-generated method stub
	return false;
}
 
 }
	
