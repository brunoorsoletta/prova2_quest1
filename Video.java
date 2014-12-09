

public class Video extends Elemento implements Dimensao {
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
}
