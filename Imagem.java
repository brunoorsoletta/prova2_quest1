

public class Imagem extends Elemento implements Dimensao, Rotaciona {
	private double angulo;
	private int altura;
	private int largura;
	
	// implements dimensao
	public void setRedimensiona(int a, int l) {
		this.largura = l;
		this.altura = a;
	}
	public int getDimensaoA() {
		return this.altura;
	}	
	public int getDimensaoL() {
		return this.largura;
	}
	
	// implements rotaciona
	public double getRotacao() {
		return this.angulo;
	}	
	public void setRotaciona(double r) {
		this.angulo = r;
	}	
}
