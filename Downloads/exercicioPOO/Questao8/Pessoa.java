package Questao09;

import java.util.Date;

public abstract class Pessoa {
	
	private String nome;
	private Data nascimento;
	
	public Pessoa(String n, Data d){
		this.nome = n;
		this.nascimento = d;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}

	public abstract void imprimeDados();

}
