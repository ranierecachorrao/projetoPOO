package Questao10;

public class Quadrado extends Quadrilateros{

	public Quadrado(double l1, double l2, double l3, double l4) {
		super(l1, l2, l3, l4);
	}

	public double calculaArea() {
		return super.getLado1() * super.getLado1();
	}

	public double calculaPerimetro() {
		return super.getLado1() * 4;
	}
	
	public String toString(){
		return "Os 4 lados = " + super.getLado1();
	}
}
