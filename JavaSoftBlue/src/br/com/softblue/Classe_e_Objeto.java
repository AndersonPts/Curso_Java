package br.com.softblue;

import java.util.Date;

public class Classe_e_Objeto {
	//Atributos -> Caracter�sticas da classe representadas por substantivos
	//M�todos -> Opera��es que a classe � capaz de realizar, sendo representados por verbos
	//Ex.: Livro(Classe) -> Instancia -> Livro1(Objeto)

	public class Livro{
		String isbn;
		int numPgs;
		
		Livro livro1 = new Livro(); //<- Instanciar um objeto
		
		void emprestar (String isbn) { //M�todo
			
		}
		void devolver() { //M�todo
			
		}
		void reservar() {
			livro1.numPgs = 231;// <- Todos os obejtos herdam os atributos da Classe m�e e passam valorres para um objeto
		}
		int reservar(int dias) {
			return dias;
			
		}
	}
	
	public class circuito{
		private double raio;//Atributo da Classe
		
		private void setRaio(double raio/*Par�metro do m�todo*/) {
			// TODO Auto-generated method stub
			this.raio = raio; /*Par�metro do m�todo*/
			
			/* 						Utiliza��o do This
			 * 
			 * Usado em basicamente duas situa��es
			 * 
					� Diferenciar um atributo do objeto de um argumento do m�todo.
					� Fornecer a refer�ncia do pr�prio objeto para outro m�todo.
			 * 
			 * */
		}
	}
}
/*
	Garbage Collector
	� Servi�o da JVM que executa em segundo plano
	
    � Procura objetos no heap que n�o s�o mais utilizados pela aplica��o e os remove
   
    � N�o pode ser controlado pelo desenvolvedor
    
    � No stack os objetos s�o destru�dos no fim da aplica��o
 */
