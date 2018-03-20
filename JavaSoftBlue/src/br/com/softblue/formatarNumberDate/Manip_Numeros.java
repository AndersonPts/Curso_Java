package br.com.softblue.formatarNumberDate;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Manip_Numeros {
	public static void main(String[] args) {

		double d = 1145.4;

		// FORMATA��O PADR�O BRASIL
		NumberFormat nf1 = NumberFormat.getInstance();
		String s1 = nf1.format(d);
		System.out.println(s1);

		// FORMATA��O PADR�O USA
		NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("en", "US"));
		String s2 = nf2.format(d);
		System.out.println(s2);

		// FORMATA��O MOEDA BR
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		String s3 = nf3.format(d);
		System.out.println(s3);

		// FORMATA��O MOEDA OUTROS PA�SES (USA)
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		String s4 = nf4.format(d);
		System.out.println(s4);

		// DEFININDO PADR�O DE FORMATA��O PARA MOEDAS
		DecimalFormat df1 = new DecimalFormat("00000.000"); // Mascara desejada
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(); // Formatar a apar�ncia do n�mero
		dfs.setDecimalSeparator('-'); // Defini qual caracter q deseja colocar no separador
		df1.setDecimalFormatSymbols(dfs); // Passa a mascara para p formatador de s�mbolos
		String s5 = df1.format(d);
		System.out.println(s5);
	}
}
