package br.com.softblue.multithread_sincronismo;

public class PessoaSync implements Runnable{
	
	private ContaBancariaSync contaBancaria;
	
	public PessoaSync(ContaBancariaSync conta) {
		// TODO Auto-generated constructor stub
	}

	public void Pessoa(ContaBancariaSync contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				contaBancaria.sacar(200);
				Thread.sleep(100);
				
				contaBancaria.depositar(200);
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
