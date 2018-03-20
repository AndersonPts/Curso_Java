package br.com.softblue.javadoc;

public class Aplicacao {
	public static void main(String[] args) {
		
		Contato c = new Contato("José", "xpto@otpx.com");
		c.definirEndereco("Rua dos Bobos", "0");
		
		c.setNome("José");
		
		System.out.println("Nome: " + c.getNome());
		System.out.println("Email: "+ c.getEmail());
	}
}
