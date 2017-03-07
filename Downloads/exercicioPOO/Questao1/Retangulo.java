package Questao1;

public class Retangulo {
	
	private double altura;
	private double largura;
	
	public Retangulo(){
		this.altura = 0;
		this.largura = 0;
	}
	
	public Retangulo(double a, double l){
		this.altura = a;
		this.largura = l;
	}
	
	public String toString(){
		return "Altura: " + this.altura + " Largura: " + this.largura;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Retangulo)){
			return false;
		}else{
			Retangulo r = (Retangulo) obj;
			if(this.altura == r.getAltura() && this.largura == r.getLargura()){
				return true;
			}else{
				return false;
			}
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getPerimetro(){
		return 2*(this.altura+this.largura);
	}
	
	public double getArea(){
		return this.altura*this.largura;
	}

}
