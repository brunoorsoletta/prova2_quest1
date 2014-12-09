

class Palavra extends Elemento implements Formatacao, Rotaciona {
	private double angulo;
	private boolean negrito;
	private boolean italico;
	private boolean sublinhado;
	
	// implements rotaciona
	public double getRotacao() {
		return this.angulo;
	}	
	public void setRotaciona(double r) {
		this.angulo = r;
	}	
	
	// implements formatacao
	public boolean getNegrito() {
		return this.negrito;
	}
	public void setNegrito(boolean b) {
		this.negrito = b;
	}
	public boolean getItalico() {
		return this.italico;
	}
	public void setItalico(boolean b) {
		this.italico = b;
	}
	public boolean getSublinhado() {
		return this.sublinhado;
	}
	public void setSublinhado(boolean b) {
		this.sublinhado = b;
	}
}
