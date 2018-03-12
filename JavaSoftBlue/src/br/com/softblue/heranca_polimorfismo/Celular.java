package br.com.softblue.heranca_polimorfismo;

//HERANÇA

public class Celular extends Telefone {
	private String n;

	// Sempre que há Herança, a classe filha EXTENDS da classe mãe
	// Os atributos e métodos da classe mãe precisam estar com o modificador de
	// acesso = protected.
	Celular c1 = new Celular();
	

	public void telefonar(int numero) {
		super.telefonar();// Chama o método da superclasse
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

//instanceOf => Utilizado para verificar se um objeto pertence à determinada classe
