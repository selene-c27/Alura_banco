package bitebank_heredado;

public abstract class Funcionario {

		private String nombre;
		private String documento;
		private double salario;
		private int tipo;
		
		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public Funcionario () { // este es mi constructor
			
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
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		//este metodo lo vamos a volver abstracto
		public abstract double getBonificacion();
		
		/* este metodo se borro porque la clase padre se volvio abstracta
        public double getBonificacion() {
        	
        		return this.salario * 0.05;
        	
        }*/
	

}
