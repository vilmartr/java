package br.com.java.avancado;

public class FuncaoAltaOrdem {

	public static void main(String[] args) {
		Calculo SOMA = (a, b) -> a + b;
		Calculo SUBTRACAO = (a, b) -> a - b;
		Calculo DIVISAO = (a, b) -> a / b;
		Calculo MULTIPLICACAO = (a, b) -> a * b;

		System.out.println(executa(SOMA, 1, 3));
		System.out.println(executa(SUBTRACAO, 4, 3));
		System.out.println(executa(DIVISAO, 4, 2));
		System.out.println(executa(MULTIPLICACAO, 7, 3));

	}

	public static int executa(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}

}

@FunctionalInterface
interface Calculo {
	public int calcular(int a, int b);
}