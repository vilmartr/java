package br.com.java.recursividade;

public class FatorialTaiCall {

	public static void main(String[] args) {
		System.out.println(fatorialA(5));
	}

	public static double fatorialA(double valor) {
		return fatorialComTaiCall(valor, 1);
	}

	public static double fatorialComTaiCall(double valor, double numero) {
		if (valor == 0) {
			return numero;
		}
		return fatorialComTaiCall(valor -1, numero * valor);
	}
}
