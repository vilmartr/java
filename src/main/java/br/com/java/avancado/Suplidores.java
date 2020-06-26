package br.com.java.avancado;

import java.util.function.Supplier;

public class Suplidores {

	public static void main(String[] args) {
		Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
		System.out.println(instanciaPessoa.get());
		
		
		Supplier<Pessoa> instanciaPessoaMetodoDeReferencia = Pessoa::new;
		System.out.println(instanciaPessoaMetodoDeReferencia.get());

	}

}

class Pessoa {

	public Pessoa() {
		nome = "Vilmar";
		idade = 40;
	}

	private String nome;
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
}
