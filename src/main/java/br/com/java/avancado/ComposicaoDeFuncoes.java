package br.com.java.avancado;

import java.util.function.UnaryOperator;

public class ComposicaoDeFuncoes {
	public static void main(String[] args) {
		UnaryOperator<Integer> calculaValorVezesTrinta = valor -> valor * 30;
		System.out.println("Resultado: " + calculaValorVezesTrinta.apply(10));
	}
}
