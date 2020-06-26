package br.com.java.avancado;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Predicate<String> estaVazio = valor -> valor.isEmpty();
		System.out.println(estaVazio.test(""));
		System.out.println(estaVazio.test("Olá!"));

		Predicate<String> estaVazioMetodoDeReferencia = String::isEmpty;
		System.out.println(estaVazioMetodoDeReferencia.test(""));
		System.out.println(estaVazioMetodoDeReferencia.test("Olá!"));

		Predicate<String> estaVazio2 = valor -> {
			return valor.isEmpty();
		};
		System.out.println(estaVazio2.test(""));
		System.out.println(estaVazio2.test("Olá!"));

	}

}
