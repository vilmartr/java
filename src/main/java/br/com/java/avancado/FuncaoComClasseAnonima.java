package br.com.java.avancado;

public class FuncaoComClasseAnonima {

	public static void main(String[] args) {
		FuncaoAnonima colocarPrefixoNoMome = new FuncaoAnonima() {
			@Override
			public String gerar(String valor) {
				return "Sr. " + valor;
			}
		};
		
		System.out.println(colocarPrefixoNoMome.gerar("Vilmar"));
	}
}

interface FuncaoAnonima {
	public String gerar(String valor);

}
