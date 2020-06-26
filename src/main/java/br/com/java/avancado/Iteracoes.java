package br.com.java.avancado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

	public static void main(String[] args) {
		String[] nomes = {"Maria", "Raquel", "Vilmar", "Java", "Vilmar" };		
		imprimirNomesFiltrados(nomes);
		imprimirTodosOsNomes(nomes);
		
		Integer[] numeros = {2,3,5,1,4};
		imprimirODobroDeCadaItemDaLista(numeros);
		
		List<String> linguagens = new ArrayList<>();
		linguagens.add("Java");
		linguagens.add("PHP");
		linguagens.add("Python");
		linguagens.add("Java EE");
		linguagens.add("Java SE");
		
		linguagens.stream()
			.filter(linguagem -> linguagem.startsWith("Java"))
			.forEach(System.out::println);
		
	}
	
	public static void imprimirNomesFiltrados(String... nomes) {
		String nomesParaImprimir = "";
		for (int i = 0; i < nomes.length; i++) {
			if(nomes[i].equals("Vilmar")) {
				nomesParaImprimir += nomes[i];
			}
			
		}
		System.out.println(nomesParaImprimir);
		
		String nomesParaImprimirUsandoStream = Stream.of(nomes).filter(nome -> "Vilmar".equals(nome))
				.collect(Collectors.joining());
			System.out.println(nomesParaImprimirUsandoStream);
	}
	
	public static void imprimirTodosOsNomes(String... nomes ) {
		for (String nome : nomes) {
			System.out.println("Usando for: " + nome);
		}
		
		Stream.of(nomes)
			.forEach(nome -> System.out.println("Usando Stream: " + nome));
	}
	
	
	public static void imprimirODobroDeCadaItemDaLista(Integer... numeros ) {
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
		Stream.of(numeros)
			.map(numero -> numero * 2)
			.forEach(System.out::println);
	}
	
	

}
