package br.com.softblue.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class EscreverArquivo {
	
	public static void main(String[] args) throws IOException {
		
		
		// API DE I/O DO JAVA
		
		/*##### OP��O MAIS COMPLICADA, UTILIZANDO BYTES (OutputStream) #####
		
		//OutputStream -> CLASSE ABSTRATA -> PARA SA�DA DE DADOS PARA UM ARQUIVO.
		try (OutputStream os = new FileOutputStream("saida.txt")) {
			
			// DEFINI O TEXTO A SER INSERIDO NO ARQUIVO DE SA�DA
			String s = "Texto a ser gravado no arquivo.";
			
			//PARA TRANSMITIR O TEXTO PARA A SA�DA � NECESS�RIO TRANSFORMAR EM UM ARRAY DE BYTES
			// O BUFFER TEM EXTAMENTE O TAMANHO DA STRING
			byte[] buffer = s.getBytes();
			
			os.write(buffer);
			
		}*/
		
		//##### OP��O MAIS SIMPLIFICADA, UTILIZANDO BufferedWriter #####
		
		//String s = "Texto a ser gravado no arquivo Utilizando o m�todo BufferedWriter.";
		
		//try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida2.txt"))){
			//  writer.write(s);
		 // }
		
		//##### OP��O MAIS INTUITIVA, UTILIZANDO PrintWriter #####
		
		//ENCAPSULA A CHAMADA E TRANSFORMA EM MAIS BAIXO N�VEL
		
		String s = "Texto a ser gravado no arquivo Utilizando o m�todo PrintWriter.";
		
		try (PrintWriter pw = new PrintWriter("saida3.txt")){
			pw.println(s);
			System.out.println("Arquivo criado com sucesso!");
		}
		 
	}

}
