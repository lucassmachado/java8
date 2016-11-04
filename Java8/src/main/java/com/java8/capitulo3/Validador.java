package com.java8.capitulo3;

@FunctionalInterface
public interface Validador<T> {

	boolean valida(T t);

}
