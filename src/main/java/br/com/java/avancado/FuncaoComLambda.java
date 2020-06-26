package br.com.java.avancado;

public class FuncaoComLambda {

	public static void main(String[] args) {
		FuncaoLambda colocarPrefixoNoNome = valor -> "Sr. " + valor;
		System.out.println(colocarPrefixoNoNome.gerar("Vilmar"));
		
		FuncaoLambda colocarPrefixoEmDoisNomes = valor -> {
			return "Sr. " +valor;
		};		
		System.out.println(colocarPrefixoEmDoisNomes.gerar("Vilmar"));
		
		FuncaoLambdaSemRetorno colocarPrefixoNoNomeSemRetorno = valor -> {
			System.out.println("Sr. " + valor);
			System.out.println("Sr. " + valor);
			System.out.println("Sr. " + valor);
		};		
		colocarPrefixoNoNomeSemRetorno.gerar("Vilmar");
	}
}

@FunctionalInterface
interface FuncaoLambda {
	public String gerar(String valor);
}

@FunctionalInterface
interface FuncaoLambdaSemRetorno {
	public void gerar(String valor);
}
