package aula1_exercicio;

public class Main {

	public static void main(String[] args) {
		
		//instanciar uma impressora
		Impressora i1 = new Impressora();
		//atribuir valores
		i1.modelo = "Epson";
		i1.cor = "Preta";
		i1.bulk = true;
		i1.papel = false;
		i1.peso = "2,5KG";
		i1.ligar();
		i1.colocarPapel();
		//status
		System.out.println("Mostrando status da impressora\n");
		i1.status();
		i1.imprimir();
		
		System.out.println("");
		
		//instanciar estudo
		Estudo e1 = new Estudo();
		//atribuir valores
		e1.hora = "13:30";
		e1.local = "Faculdade";
		e1.material = false;
		e1.prepararMaterial();
		//status
		System.out.println("Mostrando status do estudo\n");
		e1.status();
		e1.começar();
	
		
	}

}
