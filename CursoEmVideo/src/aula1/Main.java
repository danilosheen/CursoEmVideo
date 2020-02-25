package aula1;

public class Main {

	public static void main(String[] args) {
		
		//instanciando caneta 1
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 90;
		c1.destampar();
		//mostrando status
		c1.status();
		c1.rabiscar();
		
		System.out.println("");
		
		//instanciando caneta 2
		Caneta c2 = new Caneta();
		c2.modelo = "Compactor";
		c2.cor = "Preta";
		c2.ponta = 0.7f;
		c2.carga = 50;
		c2.tampar();
		//mostrando status
		c2.status();
		c2.rabiscar();
		
		
	}

}
