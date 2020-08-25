package com.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		// filtrando apenas cursos com alunos maior que 50
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.forEach(c -> System.out.println(c.getAlunos()));
		
		// transformando Stream de Curso para Stream de String apenas com os nomes dos cursos
		cursos.stream()
			.map(Curso::getNome)
			.forEach(System.out::println);
	}

}
