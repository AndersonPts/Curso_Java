package br.com.softblue.formatarNumberDate;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Manip_Numeros {
	public static void main(String[] args) {

		double d = 1145.4;

		// FORMATAÇÃO PADRÃO BRASIL
		NumberFormat nf1 = NumberFormat.getInstance();
		String s1 = nf1.format(d);
		System.out.println(s1);

		// FORMATAÇÃO PADRÃO USA
		NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("en", "US"));
		String s2 = nf2.format(d);
		System.out.println(s2);

		// FORMATAÇÃO MOEDA BR
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		String s3 = nf3.format(d);
		System.out.println(s3);

		// FORMATAÇÃO MOEDA OUTROS PAÍSES (USA)
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		String s4 = nf4.format(d);
		System.out.println(s4);

		// DEFININDO PADRÃO DE FORMATAÇÃO PARA MOEDAS
		DecimalFormat df1 = new DecimalFormat("00000.000"); // Mascara desejada
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(); // Formatar a aparência do número
		dfs.setDecimalSeparator('-'); // Defini qual caracter q deseja colocar no separador
		df1.setDecimalFormatSymbols(dfs); // Passa a mascara para p formatador de símbolos
		String s5 = df1.format(d);
		System.out.println(s5);
	}
}
