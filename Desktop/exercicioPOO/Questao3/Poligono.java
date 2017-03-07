package Questao3;

public class Poligono {
	
	private Ponto pontos[];
	private int tam;
	
	public Poligono(int qtde){
		this.pontos = new Ponto[qtde];
		this.tam = 0;
	}
	
	public void addPonto(Ponto p){
		this.pontos[this.tam] = p;
		this.tam++;
	}
	
	public Ponto getPonto(int x, int y)throws Exception{
		for(Ponto p: this.pontos){
			if(p.getX() == x && p.getY() == y){
				return p;
			}
		}
		throw new Exception("Ponto não existe!");
	}
	
	public void removePonto(int x, int y)throws Exception{
		for(Ponto p: this.pontos){
			if(p.getX() == x && p.getY() == y){
				p = null;
				break;
			}
		}
		throw new Exception("Ponto não existe!");
	}
	
	public String toString(){
		String msg = "";
		for(Ponto p: this.pontos){
			msg += p.toString() + "\n";
		}
		return msg;
	}
	
	public double calculaArea(){
		int soma = 0;
		int total = 0;
		for(int i = 0; i < this.pontos.length; i++){
			if(i < this.pontos.length-1){
				soma += (this.pontos[i].getX() * this.pontos[i+1].getY()) - (this.pontos[i+1].getX() * this.pontos[i].getY());
			}else{
				soma += (this.pontos[i].getX() * this.pontos[0].getY()) - (this.pontos[0].getX() * this.pontos[i].getY());
			}
				
		}
		return (soma / 2);
	}


}
