package com.java8.datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExerciciosData {

	public static void main(String[] args) {
		LocalDate dataFuturo = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(dataFuturo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		Period periodo = Period.between(LocalDate.now(), dataFuturo);
		System.out.println(periodo);
	}
	
}
