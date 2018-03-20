package br.com.softblue.javadoc;

/**
 * Classe que representa contatos
 * 
 * @author Anderson
 * @version 1.0
 * 
 *
 */
public class Contato {

	/**
	 * Definição de variáveis.
	 */
	private String nome;
	private String email;
	private Endereco endereco;

	public Contato(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public void definirEndereco(String rua, String numero) {
		endereco.setRua(rua);
		endereco.setNumero(numero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
