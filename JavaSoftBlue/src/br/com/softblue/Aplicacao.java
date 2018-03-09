package br.com.softblue;


public class Aplicacao {

	public static void main(String[] args) {
		
		Matematica m1 = new Matematica();
		int soma = m1.somar(3, 5);
		//System.out.println(soma);
		
		Matematica m2 = new Matematica();
		int soma2 = m2.somar(10, 5, 9);
		//System.out.println(soma2);
		
		Matematica m3 = new Matematica();
		int soma3 = m3.somar(16, 9);
		//System.out.println(soma3);
	}
}
