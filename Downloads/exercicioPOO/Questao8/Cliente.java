package Questao09;

public class Cliente extends Pessoa{
	
	private int codigo;

	public Cliente(String n, Data d, int cod) {
		super(n, d);
		this.codigo = cod;
	}

	public void imprimeDados() {
		System.out.print("(Nome: " + super.getNome() + ") (Código: " + this.codigo + ") (Data Nascimento: " + 
	    super.getNascimento().getDia() + "/" + super.getNascimento().getMes() + "/" + super.getNascimento().getAno() + ")");
	}

}
