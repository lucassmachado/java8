package com.java8.capitulo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsuarioTeste {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("user 1", 150);
		Usuario user2 = new Usuario("user 2", 120);
		Usuario user3 = new Usuario("user 3", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		// for convencional
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}

		// implementando a interface Consumer
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);

		// classe anonima
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});

		// lambdas
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
}
