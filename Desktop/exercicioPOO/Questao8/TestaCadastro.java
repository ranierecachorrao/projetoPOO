package Questao09;

public class TestaCadastro {

	public static void main(String[] args) {
		
		CadastroPessoas cP = new CadastroPessoas();
		
		Data d = new Data(10,10,10);
		
		Pessoa pC1 = new Cliente("José",d,001);
		Pessoa pC2 = new Cliente("Pedro",d,002);
		Pessoa pC3 = new Cliente("Francisco",d,003);
				
		Pessoa pF1 = new Funcionario("Penha",d,934);
		Pessoa pF2 = new Funcionario("Joana",d,934);
		Pessoa pF3 = new Funcionario("Bety",d,934);
				
		Pessoa pG1 = new Gerente("Maria",d,1200,"Caixa");
		Pessoa pG2 = new Gerente("Paula",d,1200,"Vendas");
		Pessoa pG3 = new Gerente("Walter",d,1200,"Estoque");
		
		cP.cadastraPessoa(pC1);
		cP.cadastraPessoa(pC2);
		cP.cadastraPessoa(pC3);
		cP.cadastraPessoa(pF1);
		cP.cadastraPessoa(pF2);
		cP.cadastraPessoa(pF3);
		cP.cadastraPessoa(pG1);
		cP.cadastraPessoa(pG2);
		cP.cadastraPessoa(pG3);
		
		cP.imprimeCadastro();
	}

}
