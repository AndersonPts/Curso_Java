package br.com.softblue;

import java.util.Date;

public class Classe_e_Objeto {
	//Atributos -> Características da classe representadas por substantivos
	//Métodos -> Operações que a classe é capaz de realizar, sendo representados por verbos
	//Ex.: Livro(Classe) -> Instancia -> Livro1(Objeto)

	public class Livro{
		String isbn;
		int numPgs;
		
		Livro livro1 = new Livro(); //<- Instanciar um objeto
		
		void emprestar (String isbn) { //Método
			
		}
		void devolver() { //Método
			
		}
		void reservar() {
			livro1.numPgs = 231;// <- Todos os obejtos herdam os atributos da Classe mãe e passam valorres para um objeto
		}
		int reservar(int dias) {
			return dias;
			
		}
	}
	
	public class circuito{
		private double raio;//Atributo da Classe
		
		private void setRaio(double raio/*Parâmetro do método*/) {
			// TODO Auto-generated method stub
			this.raio = raio; /*Parâmetro do método*/
			
			/* 						Utilização do This
			 * 
			 * Usado em basicamente duas situações
			 * 
					– Diferenciar um atributo do objeto de um argumento do método.
					– Fornecer a referência do próprio objeto para outro método.
			 * 
			 * */
		}
	}
}
/*
	Garbage Collector
	• Serviço da JVM que executa em segundo plano
	
    • Procura objetos no heap que não são mais utilizados pela aplicação e os remove
   
    • Não pode ser controlado pelo desenvolvedor
    
    • No stack os objetos são destruídos no fim da aplicação
 */
