package aula2;

public class Caneta {
	
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Qual a carga? " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true){
			System.out.println("A caneta está tampada, não posso escrever");
		}
		else {
			System.out.println("A caneta está destampada, estou escrevendo");
			
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}
  
	//getters and setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	

}
