package com.java8.capitulo3;

public class EscopoVariaveisLocais {

	public static void main(String[] args) {
		int numero = 5;
		new Thread(() -> {
			System.out.println(numero);
		}).start();

		// não compila porque não pode alterar variavel que está sendo utilizado
		// num contexto lambda
		// numero = 1;
	}

}
