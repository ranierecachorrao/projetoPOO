package Questao4;

public class TesteQ4 {

	public static void main(String[] args) throws Exception {
		Bit b1 = new Bit(4);
		b1.addBit(true);
		b1.addBit(true);
		b1.addBit(true);
		b1.addBit(true);
		
		Bit b2 = new Bit(4);
		b2.addBit(true);
		b2.addBit(false);
		b2.addBit(true);
		b2.addBit(false);
		
		b2.modificar(false, 0);
		b1.modificar(false, 0);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		boolean []bAND = new boolean[4];
		bAND = b1.AND(b1.getBits(), b2.getBits());
		System.out.println(b1.converte(bAND));
		
		boolean []bOR = new boolean[4];
		bOR = b1.OR(b1.getBits(), b2.getBits());
		System.out.println(b1.converte(bOR));
		
		boolean []bNOT = new boolean[4];
		bNOT = b1.NOT(b1.getBits());
		System.out.println(b1.converte(bNOT));
		
		System.out.println(b1.equals(b1));
	}

}
