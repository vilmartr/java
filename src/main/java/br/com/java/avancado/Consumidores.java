package br.com.java.avancado;

import java.util.function.Consumer;

public class Consumidores {

	public static void main(String[] args) {
		//USANDO PREDICADO
		Consumer<String> imprimirPrimeiraFrase = frase -> System.out.println(frase);
		imprimirPrimeiraFrase.accept("Ol�!");

		//USANDO M�TODO DE REFER�NCIA
		Consumer<String> imprimirSegundaFraseMetodoDeReferencia = System.out::println;
		imprimirSegundaFraseMetodoDeReferencia.accept("Ol�!");
	}
}
