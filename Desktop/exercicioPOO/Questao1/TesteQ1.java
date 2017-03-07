package Questao1;

public class TesteQ1 {

	public static void main(String[] args) {
		
		Retangulo r = new Retangulo();
		
		r.setAltura(5);
		r.setLargura(10);
		
		System.out.println(r.toString());
		
		System.out.println(r.getPerimetro());
		
		System.out.println(r.getArea());
		
		if(r.equals(r)){
			System.out.println("É Retangulo");
		}else{
			System.out.println("Não é Retangulo");
		}
		
		

	}

}
