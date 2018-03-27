package br.com.softblue.multithread_sincronismo;

public class Contador {
	
	private int valor;
	
	public synchronized void incrementar() {
		
		// Para garantir q o método seja utilizado uma unica vez por thread, utiliza-se o syncronyze.
		//Evitar concorrencia entre threads
		valor++;
	}
	
	public int getValor() {
		return valor;
	}
}
