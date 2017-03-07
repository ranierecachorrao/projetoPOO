package Questao10;

public class Circulo implements FormasGeometricasIF{
	
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}

	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}

	public double calculaPerimetro() {
		return 2 * Math.PI * this.raio;
	}

	public String toString(){
		return "Raio: " + this.raio;
	}	
}
