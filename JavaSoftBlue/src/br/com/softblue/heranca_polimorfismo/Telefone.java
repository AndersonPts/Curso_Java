package br.com.softblue.heranca_polimorfismo;

class Telefone {
	
		protected String tipo;
		protected String modelo;
		protected String numero;
		
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		
		protected void telefonar() {
			System.out.println("Digite o numero: ");
		}
		

}
