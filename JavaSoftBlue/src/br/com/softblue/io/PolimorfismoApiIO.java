package br.com.softblue.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PolimorfismoApiIO {

	public static void main(String[] args) throws IOException {

		/*
		 * FileInputStream in1 = new FileInputStream("entrada.txt"); 
		 * FileOutputStream out1 = new FileOutputStream("saida5.txt"); 
		 * PrintStream out1 = System.out;
		 * 
		 * transfer(in1, out1);
		 */
		
		/*
		 * FileInputStream in1 = new FileInputStream("entrada.txt"); 
		 * FileOutputStream out1 = new FileOutputStream("saida5.txt"); 
		 * PrintStream out1 = System.out;
		 * 
		 * transfer(in1, out1);
		 */

		//MÉTODO PARA QNDO ALGO SEJA DIGITADO NO CONSOLE, SEJA GRAVADO NO ARQUIVO
		InputStream cin = System.in;
		FileOutputStream out1 = new FileOutputStream("saida4.txt");
		transfer(cin, out1);

	}

	// MÉTODO CAPAZ DE TRANSFERIR UMA STREAM DE ENTADA PARA UMA STREAM DE SAÍDA
	private static void transfer(InputStream in, OutputStream out) throws IOException {

		byte[] buffer = new byte[1024];

		int bytesLidos;
		while ((bytesLidos = in.read(buffer)) > -1) {
			out.write(buffer, 0, bytesLidos);
			//System.out.println("Gravado com sucesso!");

		}

	}

}
