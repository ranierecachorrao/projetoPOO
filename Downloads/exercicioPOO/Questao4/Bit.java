package Questao4;

public class Bit {

	private boolean bits[];
	int index;
	
	public Bit(int tam){
		bits = new boolean[tam];
		this.index = 0;
	}

	public boolean getBit(int indice) throws Exception{
		if(this.bits[indice] || !this.bits[indice]){
			return this.bits[indice];
		}
		throw new Exception("Não existe nesse indice!");
	}
	
	public void addBit(boolean bo){
		this.bits[this.index] = bo;
		this.index++;
	}

	public void modificar(boolean bit, int indice) throws Exception{
		if(this.bits[indice] != true || this.bits[indice] != false){
			this.bits[indice] = bit;
		}else{
			System.out.println(this.bits[indice]);
			throw new Exception("Não existe nesse indice!");
		}
	}
	
	public String toString(){
		String msg = "";
		for(int i = 0; i < this.index; i++){
			if(this.bits[i]){
				msg += 1;
			}else{
				msg += 0;
			}
		}
		return msg;
	}
	
	public String converte(boolean []bo){
		String msg = "";
		for(int i = 0; i < this.index; i++){
			if(bo[i]){
				msg += 1;
			}else{
				msg += 0;
			}
		}
		return msg;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Bit)){
			return false;
		}else{
			Bit b = (Bit) obj;
			if(b.equals(this.bits)){
				return false;
			}
			return true;
		}
	}
	
	public boolean[] getBits(){
		return this.bits;
	}
	
	public boolean[] AND(boolean []bits1, boolean []bits2){
		boolean []temp = new boolean[bits1.length];
		for(int i = 0; i < this.index; i++){
			if(bits1[i] && bits2[i]){
				temp[i] = true;
			}else{
				temp[i] = false;
			}
		}return temp;
	}
	
	public boolean[] OR(boolean[] bits1, boolean[] bits2){
		boolean []temp = new boolean[bits1.length];
		for(int i = 0; i < this.index; i++){
			if(!bits1[i] && !bits2[i]){
				temp[i] = false;
			}else{
				temp[i] = true;
			}
		}return temp;
	}
	
	public boolean[] NOT(boolean[] bits1){
		boolean []temp = new boolean[bits1.length];
		for(int i = 0; i < this.index; i++){
			if(bits1[i]){
				temp[i] = false;
			}else{
				temp[i] = true;
			}
		}return temp;
	}
	
	
	
	
}
