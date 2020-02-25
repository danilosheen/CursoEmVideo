package aula1_exercicio;

public class Impressora {
	
	//atributos
	String modelo;
	String cor;
	boolean bulk;
	boolean papel;
	boolean ligada;
	String peso;
	
	//metodos
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("A impressora tem bulk? " + this.bulk);
		System.out.println("A impressora tem papel? " + this.papel);
		System.out.println("A impressora está ligada? " + this.ligada);
		System.out.println("Qual o peso da impressora? " + this.peso);
	}
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
	void colocarPapel() {
		this.papel = true;
	}

}
