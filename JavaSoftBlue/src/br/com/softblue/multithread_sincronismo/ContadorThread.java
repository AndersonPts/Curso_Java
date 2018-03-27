package br.com.softblue.multithread_sincronismo;

public class ContadorThread extends Thread {

	// Há duas formas de criação de Thread: 1) Extendendo da classe Thread ou
	// Implementando a Classe Runnable.
	// A desvantagem de extender de Thread é que ela não pode herdar de nenhuma
	// outra classe, pois não aceita herança múltipla
	// Criação de Thread com o método run() extendido da classe Thread
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("=> " + i);
			//try-cat => Utilizado para definir prioridade das threads e tempo de execução.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
