package br.com.softblue.formatarNumberDate;

import java.util.Random;

//GERAR NÚMEROS RANDOMICOS

public class Num_Random {
	public static void main(String[] args) {
		
		//Random r = new Random(12345); => Para manter as 5 primeiras posições estáticas, passe a posições das sementes por paramêtros.
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			//double d = Math.random();
			//int d = r.nextInt(); // Pega qlquer valor de numeros inteiros
			//int d = r.nextInt(10); //GERA NUMEROS RANDOMICOS DE 0 A 100
			int d = gerarInt(50, 70);
			System.out.println((i+1) + " => " + d);
		}
	}
	
	
	//DEFINIR GERAÇÃO DE NUMEROS PASSADOS POR PARÂMETRO
	static int gerarInt(int inicio, int fim) {
		int intervalo = fim - inicio; //DEFINIR Q O FIM TEM Q SER MAIOR Q O INICIO
		int n = (int) (Math.random() * intervalo) + inicio; //RETORNA NUMEROS DENTRO DO INTERVAL PASSADO: 50 70
		return n;
	}
}
