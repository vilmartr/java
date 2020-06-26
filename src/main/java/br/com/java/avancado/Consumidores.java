package br.com.java.avancado;

import java.util.function.Consumer;

public class Consumidores {

	public static void main(String[] args) {
		//USANDO PREDICADO
		Consumer<String> imprimirPrimeiraFrase = frase -> System.out.println(frase);
		imprimirPrimeiraFrase.accept("Olá!");

		//USANDO MÉTODO DE REFERÊNCIA
		Consumer<String> imprimirSegundaFraseMetodoDeReferencia = System.out::println;
		imprimirSegundaFraseMetodoDeReferencia.accept("Olá!");
	}
}
