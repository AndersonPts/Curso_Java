package br.com.softblue.multithread_sincronismo;

public class ContaBancariaSync {
	
	//Para criar um monitor de threads é necessário a criação de um object
	//O objetc faz o gerenciamento de filas das threads
	//private final Object monitor = new Object(); ou pode usar o this, pois usa o próprio lock
	
	private double saldo = 1000;
	
	public void sacar(double valor) {
		synchronized (this) {
			saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		synchronized (this) {
			saldo += valor;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

}
