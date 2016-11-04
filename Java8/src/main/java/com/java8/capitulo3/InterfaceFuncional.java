package com.java8.capitulo3;

public class InterfaceFuncional {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i <= 1000; i++) {
				System.out.println(i);
			}
		};
		new Thread(r).start();

		// lambda diretamente ao instanciar
		new Thread(() -> {
			for (int i = 0; i <= 1000; i++) {
				System.out.println(i);
			}
		}).start();
		
		Runnable o = () -> {
			System.out.println("Teste");
		};

		System.out.println(o);
		System.out.println(o.getClass());
	}

}

