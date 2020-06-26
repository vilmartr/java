package br.com.java.avancado;

import java.util.function.Function;

public class Funcoes {

	public static void main(String[] args) {
		Function<String, String> retornarNomeAoContrario = nome -> new StringBuilder(nome).reverse().toString();
		System.out.println(retornarNomeAoContrario.apply("Vilmar"));
		
		Function<String, Integer> converterStringParaInteiroECalcularODobro = string -> Integer.valueOf(string) * 2;
		System.out.println(converterStringParaInteiroECalcularODobro.apply("12"));
		
		Function<String, Integer> converterStringParaInteiroERetornarODobro = string -> {
			return Integer.valueOf(string) * 2;
		};
		System.out.println(converterStringParaInteiroERetornarODobro.apply("22"));


	}

}
