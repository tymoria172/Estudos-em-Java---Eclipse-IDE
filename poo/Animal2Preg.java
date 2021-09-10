package poo;

public class Animal2Preg extends Exercicio2Animal {

	
	
	public Animal2Preg() {

		super("sonolento", "4");

	}

	@Override
	public void barulho(String Balido) {
		System.out.println("ZZzZzZzzZZzZzZ.....");
	}

	@Override
	public void acao(String subindo) {
		System.out.println("\nEsta Subindo na arvore....");
	}
}

