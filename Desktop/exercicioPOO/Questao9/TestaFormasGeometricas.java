package Questao10;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;

public class TestaFormasGeometricas {

	public static void main(String[] args) {
		
		List<FormasGeometricasIF> formas = new ArrayList<FormasGeometricasIF>();
		
		FormasGeometricasIF ret1 = new Retangulo(10,5,10,5);
		Quadrilateros ret2 = new Retangulo(10,5,10,5);
		FormasGeometricasIF quad1 = new Quadrado(5,5,5,5);
		Quadrilateros quad2 = new Quadrado(10,10,10,10);
		FormasGeometricasIF cir1 = new Circulo(10);
		FormasGeometricasIF cir2 = new Circulo(20);
		
		formas.add(ret1);
		formas.add(ret2);
		formas.add(quad1);
		formas.add(quad2);
		formas.add(cir1);
		formas.add(cir2);
		
		for(FormasGeometricasIF fG: formas){
			System.out.print(fG.toString());
			System.out.println("\n");
		}
		
		System.out.println("\n");
		
		for(FormasGeometricasIF fG: formas){
			System.out.print(fG.calculaArea());
			System.out.println("\n");
			System.out.print(fG.calculaPerimetro());
			System.out.println("\n");
		}

	}

}
