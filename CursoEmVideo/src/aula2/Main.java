package aula2;

public class Main {

	public static void main(String[] args) {
		
		//instanciando caneta 1
		Caneta c1 = new Caneta();
		
		c1.setModelo("Bic");
		c1.setCor("Vermelha");
		c1.setPonta(0.5f);
		c1.setCarga(80);
		c1.tampar();
		c1.status(); 
		c1.rabiscar();
		
	}

}
