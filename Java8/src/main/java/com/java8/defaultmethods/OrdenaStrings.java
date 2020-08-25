package com.java8.defaultmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("alura online", "editora casa do código", "caelum");

		Comparator<String> comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);

		palavras.sort(Comparator.comparing(String::isEmpty));

		for (String p : palavras) {
			System.out.println(p);
		}

		palavras.forEach(System.out::println);
		
		new Thread(() -> System.out.println("Executando")).start();
	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}

}