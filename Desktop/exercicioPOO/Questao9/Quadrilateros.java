package Questao10;

public abstract class Quadrilateros implements FormasGeometricasIF{
	
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	
	public Quadrilateros(double l1, double l2, double l3, double l4){
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
		this.lado4 = l4;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	public double CalculaPerimetro(){
		return (this.lado1 * this.lado2) + (this.lado3 * this.lado4);
	}
	
	public String toString(){
		return "Lado1: " + this.lado1 + " Lado2: " + this.lado2 + " Lado3: " + this.lado3 + " Lado4: " + this.lado4;
	}
}
