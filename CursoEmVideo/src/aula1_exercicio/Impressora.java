package aula1_exercicio;

public class Impressora {
	
	//atributos
	String modelo;
	String cor;
	boolean bulk;
	boolean papel;
	boolean ligada;
	float peso;
	
	//metodos
	void imprimir() {
		if (this.ligada == true && this.papel == true){
			System.out.println("Estou imprimindo");
		}
		else if(this.ligada == false){
			System.out.println("Erro, a impressora pode estar desligada");
		}
		else {
			System.out.println(("Erro, a impressora está sem papel"));
		}
	}
	void ligar() {
		this.ligada = true;
	}
	void desligar() {
		this.ligada = false;
		
	}
	void limpeza() {
		System.out.println("Estou executando a limpeza!");
	}

}
