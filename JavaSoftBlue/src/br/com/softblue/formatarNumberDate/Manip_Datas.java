package br.com.softblue.formatarNumberDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Manip_Datas {
	public static void main(String[] args) {
	//Ser�o abordados os m�todos Calendar e Date que eram utilizados at� a vers�o 8.
		//Ap�s a vers�o 8, usa-se uma API aprimorada que ser� apresentada em uma aula espec�fica.
		
		//Date => Carrega informa��es de data e hora
		
		Date date = new Date();//Construtor de data... Se o construtor estiver vazio, pega a hora corrente.
		System.out.println(date);
		//long mili = date.getTime();
		//System.out.println(mili);
		
		Calendar cal = Calendar.getInstance();//Utilizado para fazer m�tricas entre datas
		
		//cal.add(Calendar.YEAR, 1);
		
		cal.set(2020, 1, 5, 13, 30, 0); //Seta o calend�rio na m�o
		
		cal.add(Calendar.YEAR, 1); // Adiciona um ano, no ano original
		cal.add(Calendar.MINUTE, -30); //Subtrair minuto
		
		Date d = cal.getTime(); //Utiliza para pegar a informa��o de data
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);//Formatar curta para datas (sem hrs)
		String f1 = df1.format(d);		
		System.out.println(f1);
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);//Formatar curta para datas (Ano inteito 2018)
		String f2 = df2.format(d);		
		System.out.println(f2);
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);//Formatar as datas por extenso.
		String f3 = df3.format(d);		
		System.out.println(f3);
		
		//Utilizando no padr�o USA
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "US"));//Formatar as datas por extenso com padr�o dos USA.
		String f4 = df4.format(d);		
		System.out.println(f4);
		
		//FORMATA��O PERSONALIZADA
		SimpleDateFormat df5 = new SimpleDateFormat("yyyy-MM-dd");
		String f5 = df5.format(d);
		System.out.println(f5);
		
		//GERAR UM OBJETO DATE A PARTIR DE UMA STRING
		String sd1 = "2030-07-01";
		String sd2 = "01072030";
		SimpleDateFormat df6 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df7 = new SimpleDateFormat("ddMMyyyy");
		try {
			Date d1 = df6.parse(sd1);
			Date d2 = df7.parse(sd2);
			System.out.println(d1);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
