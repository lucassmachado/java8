package com.java8.capitulo3;

public class ValidadorTeste {

	public static void main(String[] args) {
		Validador<String> validadorCep = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
		
		System.out.println("CEP é valido? " + validadorCep.valida("04101-300"));
	}

}
