package br.com.softblue.heranca_polimorfismo;

//HERAN�A

public class Celular extends Telefone {
	private String n;

	// Sempre que h� Heran�a, a classe filha EXTENDS da classe m�e
	// Os atributos e m�todos da classe m�e precisam estar com o modificador de
	// acesso = protected.
	Celular c1 = new Celular();
	

	public void telefonar(int numero) {
		super.telefonar();// Chama o m�todo da superclasse
	}

	public void adicionarDDD(String ddd) {
		setN(ddd + this.numero);
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

}

//instanceOf => Utilizado para verificar se um objeto pertence � determinada classe
