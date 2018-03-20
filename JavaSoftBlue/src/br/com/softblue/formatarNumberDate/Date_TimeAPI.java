package br.com.softblue.formatarNumberDate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date_TimeAPI {
	public static void main(String[] args) {
		String dataNascimento = "17/05/1982 22:00";
		
		LocalDateTime d1 = LocalDateTime.parse(/*<-Método responsável por pegar uma string e converter para data->*/dataNascimento, /*Passa o formato da data ->*/DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime d2 = LocalDateTime.now();
		
		//Trabalhar com períodos: Horas e dias ....
		Duration d = Duration.between(d1, d2);
		
		System.out.println("Horas: "+ d.toHours());
		System.out.println("Horas: "+ d.toDays());
		
		//Pegar Períodos: Meses, Anos
		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
		System.out.println("Meses: " +p.toTotalMonths());
		System.out.println("Anos: " + ChronoUnit.YEARS.between(d1, d2)); //Calcular a qtd de anos
		System.out.println("Anos: " + ChronoUnit.WEEKS.between(d1, d2)); //Calcular a qtd de meses
	}
}
