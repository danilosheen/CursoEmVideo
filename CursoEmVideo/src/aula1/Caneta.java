package aula1;

public class Caneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Qual a carga? " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true){
			System.out.println("A caneta est� tampada, n�o posso escrever");
		}
		else {
			System.out.println("A caneta est� destampada, estou escrevendo");
			
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}

}
