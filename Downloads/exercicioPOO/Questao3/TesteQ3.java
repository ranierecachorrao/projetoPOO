package Questao3;

public class TesteQ3 {

	public static void main(String[] args) {
		Poligono p = new Poligono(7);
		Ponto p1 = new Ponto(2,-4);
		Ponto p2 = new Ponto(5,1);
		Ponto p3 = new Ponto(3,4);
		Ponto p4 = new Ponto(-5,4);
		Ponto p5 = new Ponto(-5,-7);
		Ponto p6 = new Ponto(-7,7);
		Ponto p7 = new Ponto(3,7);
		
		p.addPonto(p1);
		p.addPonto(p2);
		p.addPonto(p3);
		p.addPonto(p4);
		p.addPonto(p5);
		p.addPonto(p6);
		p.addPonto(p7);
		
		System.out.println(p.toString());
		
		System.out.println(p.calculaArea());

	}

}
