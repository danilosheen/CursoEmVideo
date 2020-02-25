package aula1_exercicio;

public class Estudo {
	
	//atributos
	String hora;
	String local;
	boolean material;
	
	//metodos
	void status() {
		System.out.println("Hora: " + this.hora);
		System.out.println("Local: " + this.local);
		System.out.println("Tenho material? " + this.material);
	}
	void comecar() {
		if (this.material == true) {
			System.out.println("Comecei a estudar");
		}
		else {
			System.out.println("Não posso estudar, estou sem material");
		}
		
	}
	void parar() {
		System.out.println("terminei meus estudos por hoje");
		
	}
	void pausar() {
		System.out.println(("Estou em pausa para o lanche"));
	}
	void prepararMaterial() {
		this.material = true;
	}

}
