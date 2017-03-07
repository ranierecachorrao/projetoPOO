package Questao09;

public class Funcionario extends Pessoa{
	
	private float salario;

	public Funcionario(String n, Data d, float s) {
		super(n, d);
		this.salario = s;
	}

	public void imprimeDados() {
		System.out.print("(Nome: " + super.getNome() + ") (Salário: " + this.salario + ") ( Salario c/ Imposto: " + calculaImposto() +
		") (Data Nascimento: " + 
		super.getNascimento().getDia() + "/" + super.getNascimento().getMes() + "/" + super.getNascimento().getAno() + ")");
	}
	
	public float calculaImposto(){
		return (float) (this.salario - (this.salario * 0.03));
	}
	
	public float getSalario(){
		return this.salario;
	}
}
