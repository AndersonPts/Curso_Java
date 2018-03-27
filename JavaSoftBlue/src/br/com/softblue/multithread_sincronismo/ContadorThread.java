package br.com.softblue.multithread_sincronismo;

public class ContadorThread extends Thread {

	// H� duas formas de cria��o de Thread: 1) Extendendo da classe Thread ou
	// Implementando a Classe Runnable.
	// A desvantagem de extender de Thread � que ela n�o pode herdar de nenhuma
	// outra classe, pois n�o aceita heran�a m�ltipla
	// Cria��o de Thread com o m�todo run() extendido da classe Thread
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("=> " + i);
			//try-cat => Utilizado para definir prioridade das threads e tempo de execu��o.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
