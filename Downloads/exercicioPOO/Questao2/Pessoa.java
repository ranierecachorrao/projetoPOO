package Questao2;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private char sexo ;
	
	public Pessoa(){
		this.nome = "Sem nome";
		this.idade = 0;
		this.altura = 0;
		this.peso = 0;
		this.sexo = 0;
	}
	
	public Pessoa(String n, int i, double a, double p, char s){
		this.nome = n;
		this.idade = i;
		this.altura = a;
		this.peso = p;
		this.sexo = s;
	}
	
	public double imc(){
		return this.peso/Math.pow(this.altura, 2);
	}
	
	public String toString(){
		if(imc() <= 18.5){
			return this.nome + " Abaixo do peso normal";
		}else if(imc() > 18.5 && imc() <= 25){
			return this.nome + " Peso Normal";
		}else if(imc() > 25 && imc() <= 30){
			return this.nome + " Acima do peso normal";
		}else{
			return this.nome + " Obesidade";
		}
	}
	
	
	
	
	
	
	
}
