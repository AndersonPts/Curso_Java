package br.com.softblue.multithread_sincronismo;

public class ContadorRunnable implements Runnable {

	// Cria��o de Thread com o m�todo run() implementado da interface Runnable
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("=> " + i);
		}

	}

}
