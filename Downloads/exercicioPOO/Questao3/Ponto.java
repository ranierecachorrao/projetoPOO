package Questao3;


public class Ponto {
	
	private int x;
	private int y;
	
	public Ponto(){
		this.x = 0;
		this.y = 0;
	}
	
	public Ponto(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Ponto)){
			return false;
		}else{
			Ponto p = (Ponto) obj;
			if(this.x == p.getX() && this.y == p.getY()){
				return true;
			}else{
				return false;
			}
		}
	}
	
	public String toString(){
		return "x = " + this.x + " y = " + this.y;
	}
}
