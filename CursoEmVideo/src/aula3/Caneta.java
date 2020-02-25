package aula3;

public class Caneta {
	
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public void status() {
		System.out.println("------------------");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tampada: "+ this.isTampada());
		System.out.println("------------------");
	}
	
	//construtor	
	public Caneta(String modelo, float ponta, String cor) {
		this.setModelo(modelo);
		this.setPonta(ponta);
		this.setCor(cor);
		this.tampada = true;
	}

	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	//getters and setters
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String c) {
		this.cor = c;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean t) {
		this.tampada = t;
	}
	
	

}
