package br.com.softblue.javadoc;

public class Aplicacao {
	public static void main(String[] args) {
		
		Contato c = new Contato("Jos�", "xpto@otpx.com");
		c.definirEndereco("Rua dos Bobos", "0");
		
		c.setNome("Jos�");
		
		System.out.println("Nome: " + c.getNome());
		System.out.println("Email: "+ c.getEmail());
	}
}
