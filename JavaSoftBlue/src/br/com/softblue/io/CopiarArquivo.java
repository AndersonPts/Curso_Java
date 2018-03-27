package br.com.softblue.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopiarArquivo {

	// Ler um arquivo .txt e salvar em um outro arquivo .txt
	// Pode ser feito para qualquer tipo de arquivo

	public static void main(String[] args) throws IOException {

		String inputFile = "entrada.txt";
		String outputFile = "saida4.txt";

		// Método para leitura de arquivo
		try (InputStream in = new FileInputStream(inputFile); OutputStream out = new FileOutputStream(outputFile)) {

			// Armazenar os dados lidos em um Buffer
			byte[] buffer = new byte[1024];

			int bytesLidos;

			// VERIFICA Q ENQUANDO O BUFFER > -1, AINDA TEM BYTES A SEREM LIDOS
			while ((bytesLidos = in.read(buffer)) > -1) {
					
				//JOGAR OS BYTES LIDOS PARA O DESTINO
				out.write(buffer, 0, bytesLidos);
				System.out.println("Saída gerado com sucesso!");
			}

		}

	}

}
