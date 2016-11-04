package com.java8.capitulo2;

public class Usuario {

	private String nome;
	private int pontos;
	private boolean moderador;

	public Usuario(String nome, int pontos) {
		super();
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void tornarModerador() {
		this.moderador = true;
	}

	public boolean isModerador() {
		return moderador;
	}
}
