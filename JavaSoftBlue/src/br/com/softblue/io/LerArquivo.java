package br.com.softblue.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) throws IOException {
		
		//###################### MODO MAIS COMPLICADO  ############################################
		// Stream de entrada

		//InputStream is = null;
		//NÃO TER BUFFER MAIS Q 1MG

		//try (InputStream is = new FileInputStream("entrada.txt")){
			//is = new FileInputStream("entrada.txt");

			// Define o tamanho do byte
			//byte[] buffer = new byte[1024];

			// Método read rebece um valor int e retorna o byte lido.
			//is.read(buffer);

			//Para contornar o lixo, podemos fazer o seguinte:
			//int bytesLidos = is.read(buffer);
			
			// Transforma os bytes lidos em texto, porém os bytes excedentes viram lixo.
			//Para não retornar as posições com lixos, passe os parâmetros
			//String s = new String(buffer, 0, bytesLidos);
			
			//System.out.println(s);
			//System.out.println(s.length());
		//} /*finally {
			//if (is != null) {
				//is.close();
		
		//###################### MODO SIMPLIFICADO  ############################################
		
		/*try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){
			
			String s = "";
			String line;
			
			while ((line = reader.readLine()) != null) {
				s += line + "\n";
				
			}
			
			//String line = reader.readLine();
			System.out.println(s);
			
		}*/
		
		try (Scanner scanner = new Scanner(new File("entrada.txt"))) {
			
			String s = "";
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				s += line + "\n";
			}
			
			System.out.println(s);
		}
			
		}
		
		
			}
// }*/
// }
// }
