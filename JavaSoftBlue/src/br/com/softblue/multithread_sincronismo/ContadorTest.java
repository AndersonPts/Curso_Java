package br.com.softblue.multithread_sincronismo;

public class ContadorTest {

	public static void main(String[] args) throws InterruptedException {

		/*ContadorThread c = new ContadorThread();
		// Método start é utilizado para iniciar uma thread.
		c.start();

		ContadorRunnable cr = new ContadorRunnable();
		// Cria-se uma instância Thread
		Thread t = new Thread(c);
		t.start();

		// ###################################################################

		MyThread[] threads = new MyThread[1000];

		Contador contador = new Contador();

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread(contador);

		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();

		}

		// Método join faz com q thread chamada aguarde até q a anterior termine
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();

		}
		System.out.println("Valor = " + contador.getValor());
		
		// ###################################################################*/
		
		ContaBancariaSync conta = new ContaBancariaSync();
		
		PessoaSync p1 = new PessoaSync(conta);
		PessoaSync p2 = new PessoaSync(conta);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Saldo = "+conta.getSaldo());

	}

}
