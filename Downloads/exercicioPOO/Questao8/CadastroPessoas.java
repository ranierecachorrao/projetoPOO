package Questao09;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
	
	private List<Pessoa> pessoas;
	
	public CadastroPessoas(){
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void cadastraPessoa(Pessoa pessoa){
		this.pessoas.add(pessoa);
	}
	
	public void imprimeCadastro(){
		int num = 1;
		for(Pessoa p: this.pessoas){
			System.out.println("\nCadastro Nº0" + num + ":");
			p.imprimeDados();
			num++;
		}
	}

}
