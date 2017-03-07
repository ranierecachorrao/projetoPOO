package Questao09;

public class Gerente extends Funcionario{
	
	private String area;

	public Gerente(String n, Data d, float s, String a) {
		super(n, d, s);
		this.area = a;
	}
	
	public void imprimeDados() {
		System.out.print("(Nome: " + super.getNome() + ") (Area: " + this.area + ") (Salario: " + super.getSalario() + 
		") ( Salario c/ Imposto: " + calculaImposto() + ") (Data Nascimento: " + 
		super.getNascimento().getDia() + "/" + super.getNascimento().getMes() + "/" + super.getNascimento().getAno() + ")");
	}
	
	public float calculaImposto(){
		return (float) (super.getSalario() - (super.getSalario() * 0.05));
	}

	
}
